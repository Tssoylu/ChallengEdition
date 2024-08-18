package Ders23_Constructors;

public class HAraba {

    String marka = "Marka belirtilmedi";
    String model = "Model belirtilmedi";
    String yakit;
    int yil;
    int fiyat;

    public HAraba(String mrk,String mdl,String ykt,int yl,int fyt){


        marka=mrk;
        model=mdl;
        yakit=ykt;
        yil=yl;
        fiyat=fyt;

    }

    public HAraba(String mrk,String mdl,int yl){

        marka=mrk;
        model=mdl;
        yil=yl;

        // istersek parametreleri azaltarak da constructor olusturabiliriz

    }
    public HAraba(){
        // gorunur durumdaki parametresiz constructor
        // defaul constructor DEGİLDİR
        // default constructor'in budy'si de bos olur
        // ancak parametresiz constructor'da budy'e kod yazilabilir

        // parametresiz constructor'in budy'sinde kod yoksa
        // default constructor ile ayni islevi gorur
        // ama yine de gorunur durumdaysa default constructor denmez.
    }

    // biz gozle gorulur herhangi bir contructor olusturdugumuzda
    // java default contructor' siler
    // bu durumda daha once olusturulmus olan objelerin sorun olamamsi icin
    // class'a parametresiz bir constructor eklememiz faydali olur.

    @Override
    public String toString() {
        return "Araba ozellikleri" +
                "\nmarka : " + marka +
                "\nodel : " + model +
                "\nyakit : " + yakit +
                "\nyil : " + yil +
                "\nfiyat : " + fiyat;
    }

    public int maxHiz(String yakit) {

        int maxHiz = 120;

        if (yakit.equalsIgnoreCase("dizel")) {

        } else if (yakit.equalsIgnoreCase("benzin")) {
            maxHiz = 230;
        } else if (yakit.equalsIgnoreCase("elektrikli")) {
            maxHiz = 180;
        }
        return maxHiz;
    }
}
