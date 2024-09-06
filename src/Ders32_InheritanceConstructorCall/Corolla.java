package Ders32_InheritanceConstructorCall;

public class Corolla extends BToyota {


        Corolla (int pc){
            super(5);
            System.out.println("Parametreli Corolla constructor");
        }
        Corolla(){

        }
        Corolla(String str){
            this();
            System.out.println("String parametreli Corolla constructor");

        }

    public static void main(String[] args) {


            Corolla corolla3=new Corolla("Ilker");
        // Parametresiz Araba constructor
        // Parametresiz Toyota Construcor
        // String parametreli Corolla constructor

        System.out.println("==================");
        Corolla corolla1=new Corolla();
        // Parametresiz Araba constructor
        // Parametresiz Toyota Construcor
        System.out.println("==================");

        Corolla corolla2=new Corolla(3);
        // Parametresiz Araba constructor
        // Parametreli Toyota Constructor
        // Parametreli Corolla constructor

    }
}
