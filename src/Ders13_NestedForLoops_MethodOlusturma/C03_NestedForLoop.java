package Ders13_NestedForLoops_MethodOlusturma;

public class C03_NestedForLoop {
    public static void main(String[] args) {

        // 1-4 arasindaki sayilar icin carpim tablosu olusturalim

        // dis dongu satirlari kontrol eder

        for (int i = 1; i <=10 ; i++) {

            // ic dongu her satirda olan degerleri kontrol eder
            for (int j = 1; j <=10 ; j++) {
                System.out.print(i*j + " ");
            }
            // ic dongu bittiginde java'yi alt satira indirmeliyiz
            System.out.println("");
        }
    }
}
