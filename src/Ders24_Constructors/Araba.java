package Ders24_Constructors;

public class Araba {

    String marka = "Marka belirtilmedi";
    String model = "Model belirtilmedi";
    String yakit;
    int yil;
    int fiyat;

    public Araba (String mrk, String mdl){
        marka=mrk;
        model=mdl;

    }


    public Araba(String marka, String model, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.fiyat = fiyat;
    }

    public Araba(String model, String marka, String yakit, int yil, int fiyat) {
        this.model = model;
        this.marka = marka;
        this.yakit = yakit;
        this.yil = yil;
        this.fiyat = fiyat;
    }

    public Araba (){

    }

    @Override
    public String toString() {
        return "Araba ozellikleri" +
                "\nmarka : " + marka +
                "\nodel : " + model  +
                "\nyakit : " + yakit  +
                "\nyil : " + yil +
                "\nfiyat : " + fiyat;
    }
}
