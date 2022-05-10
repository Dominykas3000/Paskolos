import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args){

        DuomenuNuskaitymas duomenuSkaitymas = new DuomenuNuskaitymas();
        Pagalbine pagalb = new Pagalbine();
        ShellSort sh = new ShellSort();

        HashMap<Integer,Paskola> PaskolosJson= duomenuSkaitymas.nuskaitytiallPaskola("C:\\Users\\Dominykas\\IdeaProjects\\Dsa1maUZd\\Json_files\\PaskolosTipas.json");
        ArrayList<IsdavimasGrazinimas> InOutJson = duomenuSkaitymas.nuskaitytiInout("C:\\Users\\Dominykas\\IdeaProjects\\Dsa1maUZd\\Json_files\\IsdavimaiGrazinimai.json");
        pagalb.spausdink(InOutJson);
        sh.sort(InOutJson,new IsdavimasGrazinimasComparator());
        pagalb.PaskoluPavadinimuIeskojimas(InOutJson,PaskolosJson);
        pagalb.spausdink(InOutJson);
        pagalb.countPaskolos(InOutJson,PaskolosJson);
    }
}
