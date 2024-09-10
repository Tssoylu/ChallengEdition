package Ders35_Exceptions;

public class C02_ArithmetikException {
    public static void main(String[] args) {

        // verilen iki tamsayiyi birbirine bolup
        // sonucun tam sayi olan kismini yazdirin

        int sayi1=20;
        int sayi2=0;

        try {
            // riskli oldugunu on gordugumuz kod'lar
            System.out.println(sayi1/sayi2);
            System.out.println("Bakalim bu satir calisicak mi ?");
            //
        } catch (ArithmeticException e) {
            // catch (Exception e) ongorudumuz risk
            System.out.println("Sayi sifira bolunmez");
            // catch (0'dan sonraki { } catch blogu denir
            // beklenen risk gerceklesirse calisacak kodlar

        }



        /*
           bazi exception'lar if else ile halledilebilir
           ancak tum exception'lar icin if else yeterli olmaz
         */
    }
}
