import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;

public class DuomenuNuskaitymas {

    public ArrayList<IsdavimasGrazinimas> nuskaitytiInout(String fileName) {

        ArrayList<IsdavimasGrazinimas> IO = new ArrayList();//sukuriamas naujas array list kurio reiksmes yra IsdavimoGrazinimo reiksmes
        Gson gson = new Gson();                                  //sukuriamas Gson objektas

        try (Reader reader = new FileReader(fileName)) {

            IO = gson.fromJson(reader, new TypeToken<ArrayList<IsdavimasGrazinimas>>(){}.getType()); //TypeToken padeda rasti bendrini tipo kuris padeda Gson lengviau nuskanuoti

        } catch (IOException e) {
            e.printStackTrace(); //spausidnimas stack trace jei failas nerandamas
        }
        return IO;
    }

    public HashMap<Integer,Paskola> nuskaitytiallPaskola(String fileName) {

        HashMap<Integer,Paskola> sarasas = new HashMap();
        Gson gson = new Gson();

        try (Reader reader = new FileReader(fileName)) {

            sarasas = gson.fromJson(reader, new TypeToken<HashMap<Integer,Paskola>>(){}.getType()); //TypeToken padeda rasti bendrini tipo kuris padeda Gson lengviau nuskanuoti

        } catch (IOException e) {
            e.printStackTrace();//spausidnimas stack trace jei failas nerandamas
        }
        return sarasas;
    }

}
