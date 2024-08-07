package Ders15_Overloading_WhileLoop;

public class C08_WhileLoop {
    public static void main(String[] args) {

        /*
        - while loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun
         */

        int sayi= 1423123123;

        int birlerBasamagi=0;
        int rakamlarToplami=0;

        while (sayi!=0){

            birlerBasamagi= sayi%10;
            rakamlarToplami += birlerBasamagi;
            sayi /=10;
        }
        System.out.println(rakamlarToplami);
    }
}
