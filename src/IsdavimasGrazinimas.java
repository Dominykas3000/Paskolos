public class IsdavimasGrazinimas implements  Comparable {
    private int inOut;
    private String data;
    private int paskolosKodas;
    private int suma;
    private String paskolosPavadinimas;

    public IsdavimasGrazinimas(int inOut, String data, int paskolosKodas, int suma){
        this.inOut = inOut;
        this.data = data;
        this.paskolosKodas = paskolosKodas;
        this.suma = suma;
        this.paskolosPavadinimas = paskolosPavadinimas;
    }

    public String getPaskolosPavadinimas() {
        return paskolosPavadinimas;
    }

    public void setPaskolosPavadinimas(String paskolosPavadinimas) {
        this.paskolosPavadinimas = paskolosPavadinimas;
    }

    IsdavimasGrazinimas(){}; //tuscias konstruktorius

    @Override
    public String toString() {
        return "paskolosKodas = " + paskolosKodas +
                " | paskolosPavadinimas = " + paskolosPavadinimas +
                " | inOut = " + inOut +
                " | data = " + data +
                " | suma = " + suma ;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getPaskolosKodas() {
        return paskolosKodas;
    }

    public void setPaskolosKodas(int paskolosKodas) {
        this.paskolosKodas = paskolosKodas;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public int getInOut() {
        return inOut;
    }

    public void setInOut(int inOut) {
        this.inOut = inOut;
    }

    @Override
    public int compareTo(Object o) {
        IsdavimasGrazinimas io =(IsdavimasGrazinimas) o; // objektas priskiriamas reiksmei
        if(this.inOut > io.inOut)                        // palyginamas darbartinis inOut
            return 1;
        else if(this.inOut < io.inOut)
            return -1;
        else
            return 0;
    }
}



