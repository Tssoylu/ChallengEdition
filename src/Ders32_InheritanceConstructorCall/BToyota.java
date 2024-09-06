package Ders32_InheritanceConstructorCall;

public class BToyota extends Araba {

    BToyota(){
        System.out.println("Parametresiz Toyota Construcor");
    }

    BToyota(int p1){
        System.out.println("Parametreli Toyota Constructor");
    }

    BToyota(String p2){
        super("Mehmet");
        System.out.println("String parametreli Toyota Constructor");
    }
}
