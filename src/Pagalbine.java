import java.util.ArrayList;
import java.util.HashMap;

public class Pagalbine {
    public void spausdink(HashMap<Integer,Paskola> PaskolosTipas) {//spausdina HasmMapa
        Paskola paskola = new Paskola();
        PaskolosTipas.forEach((key, value) -> System.out.println("PaskoluHashMap: " + key + " : " + value));
    }
    public void spausdink(ArrayList ArrL) {//spausidna array lista
        for (Object p : ArrL) {
            System.out.println(p);
        }
        System.out.println();
    }
    public void PaskoluPavadinimuIeskojimas(ArrayList<IsdavimasGrazinimas> io, HashMap<Integer,Paskola> paskolaHashMap){
        for(IsdavimasGrazinimas ArrIsGr : io) { // ciklas einantis per array lista io
            int id = ArrIsGr.getPaskolosKodas(); //priskiriama paskolos kodo reiksme kintamajam
            if(paskolaHashMap.containsKey(id)) { // prilyginima ar paskolos raktas is hashmapo lygus array listui
                Paskola p = paskolaHashMap.get(id); // sukuriamas PAskola objektas kuris lygus paemamam hashmapo raktui vertes id
               ArrIsGr.setPaskolosPavadinimas(p.getPavadinimas()); // is Paskola objekto paimamas atitinkamas pavadinimas ir priskiriamas array listui
            }
        }
    }
    public ArrayList<Paskola> countPaskolos(ArrayList<IsdavimasGrazinimas> InOutArrList, HashMap<Integer,Paskola> paskolaHashMap){
        //inOut=0, kai paskola isduodama || inOut =1, kai paskola grazinama
        ArrayList<Paskola> finalPaskolaArrayList = new ArrayList<>();    // sukuriamas naujas array listas
        InOutArrList.forEach((value) ->{                                 // sukamas ciklas kuris eina per Isdavimai grazinimai array lista
            Integer paskolosKodas = value.getPaskolosKodas();            // is array listo paimamas paskolos kodas
            if (paskolaHashMap.containsKey(paskolosKodas)) {             // priligynami paskolos kodai is ArrayList ir HashMap
                Paskola paskola = paskolaHashMap.get(paskolosKodas);     // sukuriamas naujas objektas Paskola su atitinkamu
                if (value.getInOut() == 1) {                             // patikranama ar paskola yra grazinta
                    if (paskola.getGrazintaSuma() != 0) {                // patikriname ar Grazinta suma nelyginuliui tam kad nustatytume ar jau nera priskirta suma
                        Integer sumG = paskola.getGrazintaSuma();        // priskiriama jau kiek ir grazinta Paskola
                        paskola.setGrazintaSuma(sumG + value.getSuma()); // priskiriama suskaiciujama galutine grazinta suma
                    } else {
                        paskola.setGrazintaSuma(value.getSuma());        // priskiriama galutine grazinta suma
                    }
                } else if (value.getInOut() == 0) {                      // patikriname ar paskola yra isduota bet ne grazinta
                    if (paskola.getIsduotaSuma() != 0) {                 // patikriname ar isduota  suma nelyginuliui tam kad nustatytume ar jau nera priskirta suma
                        Integer sum = paskola.getIsduotaSuma();          // priskiriama kiek jau yra isduotu paskolu
                        paskola.setIsduotaSuma(sum + value.getSuma());   // paskaiciujama visa suma kuri yra isduota tam tikram paskolos tipui
                    } else {
                        paskola.setIsduotaSuma(value.getSuma());         // priskiriama visa suma kuri yra isduota tam tikram paskolos tipui
                    }
                }
            }});
                paskolaHashMap.forEach((key, value) -> {                 //sukamas ciklas per kiekviena hasmapo rakta ir reiksme
            Integer isduotaSuma = value.getIsduotaSuma();                // priskiriama isduota reiksme
            Integer procentai = value.getProcentai();                    // priskiriami procentu reiksme
            Float procSuma = Float.valueOf((isduotaSuma * procentai) / 100); // suskaiciuojama kiek tikimasi gauti už isduotas paskolas
            value.setProcSuma(procSuma);                                 // procentu suma
            System.out.println("|Kodas: " +value.getKodasId()+ " |Pavadinimas: " +value.getPavadinimas()+ " |Isduota suma: "+value.getIsduotaSuma()+
                    " |Procentu suma: " +value.getProcSuma()+ " |Grazinta suma: "+value.getGrazintaSuma()+ "|" );
            finalPaskolaArrayList.add(value);                            //pridedamos visos reiksmes i array lista
        });
        return finalPaskolaArrayList;
    }
}