package Ders13_NestedForLoops_MethodOlusturma;

public class C02_StringTersineCevirme {
    public static void main(String[] args) {

        // kullanicidan bir String isteyin ve bunu tersine cevirip kaydedin

        String input="Java"; // Java her gecen gun guzellesiyor
        String tersinput="";

        for (int i = input.length()-1; i >=0 ; i--) {

            tersinput += (input.substring(i,i+1));

        }
        System.out.println("Ters hali : " + tersinput); // royisellezug nug neceg reh avaJ


    }
}
