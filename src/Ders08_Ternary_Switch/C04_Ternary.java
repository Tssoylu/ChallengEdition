package Ders08_Ternary_Switch;

public class C04_Ternary {
    public static void main(String[] args) {

        /*
        kullanicidan bir ucgenin kenar uzunluklarini alin
        eger ucgen eskenar ise "eskenar ucgen"
        degilse "eskenar ucgen degil" yazdiralim.
         */

        double kenar1=5;
        double kenar2=5;
        double kenar3=5;

        System.out.println(kenar1>0 && kenar2>0 && kenar3>0 && kenar1==kenar2 && kenar2==kenar3 ? "eskenar ucgen" : "eskenar ucgen degil");


        /*
        kullanicidan 2 sayi alin ve buyuk olmayani yazdirin.
         */

        int sayi1=21;
        int sayi2=12;

        System.out.println(sayi1>sayi2 ? sayi2 : sayi1);


    }
}
