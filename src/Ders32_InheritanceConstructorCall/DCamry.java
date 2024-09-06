package Ders32_InheritanceConstructorCall;

public class DCamry extends BToyota{


    DCamry(String pc){
        super("Deniz");
        System.out.println("String parametreli Camry");
    }
    DCamry(){
    }
    public static void main(String[] args) {

        // eger kullanilan argumente uygun bir constructor
        // parent class'da yoksa CTE olur.
        DCamry camry2=new DCamry("celal");
        //Parametreli Araba constructor
        //String parametreli Toyota Constructor
        //String parametreli Camry



        System.out.println("============");
        DCamry camry1=new DCamry();
        // Parametresiz Araba construcotor
        //
    }
}
