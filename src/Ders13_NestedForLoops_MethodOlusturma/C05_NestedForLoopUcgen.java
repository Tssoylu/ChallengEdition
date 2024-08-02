package Ders13_NestedForLoops_MethodOlusturma;

public class C05_NestedForLoopUcgen {
    public static void main(String[] args) {

        /*
        nested for Loop kullanarak assagidaki sekli hazirlayin

        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5

         */

        for (int i = 1; i <=5 ; i++) {

            for (int j = 1; j <=i ; j++) {

                System.out.print(j + " ");
                
            }
            System.out.println("");

        }
    }
}
