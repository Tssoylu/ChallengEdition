package Day02_DataTurleri_Scanner;

import javax.print.attribute.standard.JobHoldUntil;
import java.util.Scanner;

public class C07_Scanner {

    public static void main(String[] args) {

        // Soru 3- Kullanicidan ismini, soyismini ve yasini alip,
        // formatta yazidrin.
        // İsminiz : John
        // Soyisminiz : Doe
        // Yasiniz : 44
        // Kaydiniz basariyla tamamlansmistir.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen adinizi giriniz");
        // String icin kullanilabilen next() sadece ilk space'e kadar olan kismi alir,
        //                            nextLine() ise o satira yazıilan tum bilgileri alir.
        String isim= scan.nextLine();

        System.out.println("Lutfen soyadinizi giriniz");
        String soyisim= scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz");
        double yas= scan.nextDouble();

        System.out.println("Isminiz : " + isim + "\nsoyisminiz : " + soyisim+
                            "\nYasiniz : "+ yas + "\nKaydiniz tamamlanmistir");
    }
}
