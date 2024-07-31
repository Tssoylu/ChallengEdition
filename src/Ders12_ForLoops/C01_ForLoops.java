package Ders12_ForLoops;

public class C01_ForLoops {
    public static void main(String[] args) {

        String str= "Java\n";
        System.out.println(str.repeat(10));

        // 1'den 100'e kadar olan sayilari yazdirin
        // 3 basamakli 23 ile bolunebilen sayilari yazdirin

        //for (int i = 0 ; i <100 ; i++) {
           // System.out.println(i + " ");

        for (int a = 23 ; a<999 ; a+=23 ){
            System.out.println(a + " ");
        }
    }
}
