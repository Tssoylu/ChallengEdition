package Ders27_ImmutableClasses_DateAndTime;

public class C01_Immutable {
    public static void main(String[] args) {

        // Bu kod calistiginda java kac obje olusturur.

        String str="Ali";

        for (int i = 0; i <10 ; i++) {

            str +=".";
        }

        System.out.println(str); // bir obje olusturur her atamada digerini siler.
    }
}
