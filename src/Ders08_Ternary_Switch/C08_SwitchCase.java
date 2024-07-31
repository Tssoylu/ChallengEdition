package Ders08_Ternary_Switch;

public class C08_SwitchCase {
    public static void main(String[] args) {

        /*
        - kullanici'dan ay numarasi alip mevsim yazdirin.
         */

        int ayNo = 8;

        switch (ayNo) {

            case 12:
            case 1:
            case 2:
                System.out.println("Kis");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Ilk bahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Son bahar");
                break;
            default:
                System.out.println("Gecersiz ay numarasi");

        }
    }
}
