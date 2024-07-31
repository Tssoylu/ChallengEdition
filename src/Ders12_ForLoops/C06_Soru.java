package Ders12_ForLoops;

public class C06_Soru {
    public static void main(String[] args) {

        /*
        - Soru: kullanicidan pozitif bir sayi alin, 1'den baslayarak tum sayilari yazdirin,sira
          - 3 ile bolunebilir sayiya gelirse, sayi yerine "fizz"
          - 5 ile bolunebilir sayiya gelirse, sayi yerine "buzz"
          - hem 3 hem 5 ile bolunebilir sayiya gelirse, sayi yerine fizzBuzz yazdiralim
         */

        int sayi=130;

        for (int i = 1; i <= sayi; i++) {

            if (i%3==0 && i%5==0){
                System.out.print("fizzBuzz\n");
            } else if (i%3==0) {
                System.out.print("fizz ");
            } else if (i%5==0) {
                System.out.print("buzz ");
            }else {
                System.out.print(i + " ");
            }
        }
    }
}
