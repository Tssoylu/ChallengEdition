package Ders31_Inheritance;

public class BinekArac extends Arac{

    protected String marka="Binek araclarin markasi vardir";
    protected String model="Binek araclarin modeli vardir";
    protected int yil=1900;

    protected void hiz(String yakit){
        System.out.println("Binek araclarin hizi modele gore degisir");
    }
    protected void teker(){
        System.out.println("Binek araclarin 4 tekeri olur");
    }
}
