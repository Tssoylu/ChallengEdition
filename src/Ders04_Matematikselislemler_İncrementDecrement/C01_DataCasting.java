package Ders04_Matematikselislemler_İncrementDecrement;

public class C01_DataCasting {

    public static void main(String[] args) {

        int sayi1= 20;
        int sayi2= 6;  //3

        System.out.println(sayi1/sayi2);

        /*
        bolunen ve bolen sayinin ikisi de tamsayi ise, java sonucun sadece tam sayi kismini alir.
         */

        double sayi3= 6;

        System.out.println(sayi1/sayi3); //3,333333333333 int/ double daha genis olanlara gore davranir.


    }
}
