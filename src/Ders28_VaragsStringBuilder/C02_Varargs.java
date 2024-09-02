package Ders28_VaragsStringBuilder;

public class C02_Varargs {
    public static void main(String[] args) {


        topla(5,6); // 11
        topla(5,3,8); // 16
        topla(2,4,6,8); // 20
        topla(1); // 1
        topla(); // 0
        topla(1,4,2,3,6,7,9,0,2,4,5); // 43

        /*
         Bir method'da parametre sayisini sinirlandirmak istemezsek
         standart bir variable yerine varargs kullaniriz.

         (variable arguments) varargs data turunun yanina ... konularak deklare edilir
         int...  ==>  sayisi belirli olmayan int parametreler aran bir array'dir.
         */
    }

    public static void topla(int... sayilar) {

        int toplamSonucu=0;

        for (int each : sayilar
            ){
            toplamSonucu+=each;
        }
        System.out.println("Girilen sayilarin toplami : " + toplamSonucu);
    }
}
