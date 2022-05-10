public class Paskola { //java bean klase PaskolosTipas.json

    private int kodasId;
    private String pavadinimas;
    private int procentai;
    private Integer isduotaSuma=0;
    private Integer grazintaSuma =0;
    private Float procSuma  ;

    public Paskola(int kodasId, String pavadinimas, int procentai) {
        this.kodasId = kodasId;
        this.pavadinimas = pavadinimas;
        this.procentai = procentai;
    }
    @Override
    public String toString() {
        return "Paskola{" +
                "kodasId=" + kodasId +
                ", pavadinimas='" + pavadinimas + '\'' +
                ", procentai=" + procentai +
                '}';
    }
    public Paskola() {};//tuscias konstruktorius

    public Integer getGrazintaSuma() {
        return grazintaSuma;
    }
    public void setGrazintaSuma(Integer grazintaSuma) {
        this.grazintaSuma = grazintaSuma;
    }
    public Float getProcSuma() {
        return procSuma;
    }
    public void setProcSuma(Float procSuma) {
        this.procSuma = procSuma;
    }
    public Integer getIsduotaSuma() {
        return isduotaSuma;
    }
    public void setIsduotaSuma(Integer isduotaSuma) {
        this.isduotaSuma = isduotaSuma;
    }
    public int getKodasId() {
        return kodasId;
    }
    public void setKodasId(int kodasId) {
        this.kodasId = kodasId;
    }
    public String getPavadinimas() {
        return pavadinimas;
    }
    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }
    public int getProcentai() {
        return procentai;
    }
    public void setProcentai(int procentai) {
        this.procentai = procentai;
    }
}