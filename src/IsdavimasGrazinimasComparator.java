import java.util.Comparator;

public class IsdavimasGrazinimasComparator implements Comparator { // lyginama pagal pirma paskolos pavadinima tada pagal inOut

    public int compare(Object t1, Object t2) {
        IsdavimasGrazinimas ig1 = (IsdavimasGrazinimas) t1; // priskiriama pirma objekto reiksme
        IsdavimasGrazinimas ig2 = (IsdavimasGrazinimas) t2; // priskiriam antra objekto reiksme
        int InOut1 = ig1.getInOut();
        int InOut2 = ig2.getInOut();
        if(InOut1==InOut2) {                                // jei in out lygus
            int io1 = ig1.getPaskolosKodas();               //priskiriama pirmas paskolos kodas
            int io2 = ig2.getPaskolosKodas();               //priskiriama antras paskolos kodas
            if(ig1.getPaskolosKodas() > ig2.getPaskolosKodas())
                return 1;
            else if(ig1.getPaskolosKodas() < ig2.getPaskolosKodas())
                return -1;
            else return 0;
        } else { // jei InOut1 > InOut2 grazinimas teigiamas int, jei InOut1 < InOut2 grazinimas neigiamas int
            return ig1.getPaskolosKodas()- ig2.getPaskolosKodas();
        }
    }
    }

