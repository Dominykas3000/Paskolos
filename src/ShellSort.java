import java.util.ArrayList;
import java.util.Comparator;

public class ShellSort{
    public void sort(ArrayList v, Comparator cmp) { // Rusiavimas naudojant JavaBean klaseje esanti metoda compareTo()
        Object sValue;
        for(int gap = v.size()/2; gap > 0; gap /= 2){ //inicializuojamas  tarpas kuris yra viduryje ArrayListo pavadinimu V kiekvienu incramentu padalinamas is dvieju
            for(int i = gap; i < v.size(); i++){ //inicializuojamas kintamasis i kuris eina tarpu atskirta array lista
                sValue = v.get(i); // gaunamas indekse i esama reiksme
                int j = i;
                while(j >= gap && cmp.compare(sValue, v.get(j - gap)) < 0) { // kol j nera mazesnis  uz tarpa ir kol lyginant 2 kintamuosius is IsdavimasGrazinimas neissoka is arraylisto ribu
                    v.set(j, v.get(j - gap)); // vyksta perstumimas sukeiciami vietomis tos reiksmes kurios yra nutolusios per gap
                    j -= gap; // j dekrementuojamas tarpo dydziu del to kad sokinejame nuo vieno elemento prie kito atstumais kurie = gap
                }
                v.set(j, sValue);
            }
        }
    }
}

