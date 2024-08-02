package Ders13_NestedForLoops_MethodOlusturma;

public class C01_ForLoop {
    public static void main(String[] args) {

        // kullanicidan bir String alin ve bunu tersten yazdirin.

        String input="Java ne kadar guzel";

        // lezug radak en avaJ

        for (int i = input.length()-1; i >=0 ; i--) {

            System.out.print(input.charAt(i));
            
        }
    }
}
