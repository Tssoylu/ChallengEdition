package Ders23_Constructors;

public class DAraba {

    // bir proje olusturulurken tum klasslarda main method olmasina gerek yoktur.
    // cogu class obje olusturularak kullanilmak uzere hazirlanmis depolardir.
    // Biz de bu class'i araba objeleri icin bir depo olarak dizayn edelim


    // her class olusturuldugunda java o class'lardan olbje olusturulabilmesi icin
    // default bir constructor olusturur
    // bu default constructor gozukmez
    // default constructor parametresizdir ve bize standart bir obje olusturur
    // (class da ne verirsek o)

    String marka = "Marka belirtilmedi";
    String model = "Model belirtilmedi";
    String yakit;
    int yil;
    int fiyat;

    @Override
    public String toString() {
        return "Araba ozellikleri" +
                "\nmarka : " + marka +
                "\nodel : " + model  +
                "\nyakit : " + yakit  +
                "\nyil : " + yil +
                "\nfiyat : " + fiyat;
    }

    public int maxHiz(String yakit){

        int maxHiz=120;

        if (yakit.equalsIgnoreCase("dizel")){

        } else if (yakit.equalsIgnoreCase("benzin")) {
            maxHiz=230;
        } else if (yakit.equalsIgnoreCase("elektrikli")) {
            maxHiz=180;
        }
        return maxHiz;
    }
}
