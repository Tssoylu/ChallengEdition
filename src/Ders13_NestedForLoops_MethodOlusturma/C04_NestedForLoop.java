package Ders13_NestedForLoops_MethodOlusturma;

public class C04_NestedForLoop {
    public static void main(String[] args) {

        /*
        - assagidaki sekli yazdiran bir kod hazirlayin

        * * * * * *
        * * * * * *
        * * * * * *
        * * * * * *
        * * * * * *

         */

        for (int i = 1; i <=5 ; i++) { // outer Loop

            for (int j = 1; j <=6 ; j++) { // inner Loop

                System.out.print("* "); // for loop icindeki yazdirilmasi isteneni belirler
            }

            System.out.println(""); // ic loop bitince alt satira gecer
        }
    }
}
