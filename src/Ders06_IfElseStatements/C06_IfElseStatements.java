package Ders06_IfElseStatements;

public class C06_IfElseStatements {
    public static void main(String[] args) {


        /*
        if else statement'da suslu parantez kullanmazsak hem if budy'si hem de else body'si icin sadece
        bir satir kabul eder.

        sonraki satirlar if else ile iliskilendirilmez. her durumda calisir.
         */

        int not=46;
        if (not>=50) {
            System.out.println("Sinifi gectin");
            System.out.println("Yazin kafan rahat");
        }else  {
            System.out.println("bu dersten kaldin");
            System.out.println("yaz okuluna bekleriz");
        }
    }
}
