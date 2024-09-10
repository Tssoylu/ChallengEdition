package Ders36_CheckedExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class C01_IOExceptions {
    public static void main(String[] args) throws FileNotFoundException {


        FileInputStream fis =new FileInputStream("src/Ders36_CheckedExceptions/Deneme.txt");

        FileOutputStream fos =new FileOutputStream("src/Ders36_CheckedExceptions/Deneme.txt");


        // Java ile bilgisayarimiza bir dosya olusturmak istersek
        // FileInputStream class'indan obje olusturup
        // o obje araciligiyla dosyayi kullanabiliriz

        // FileInputStream olustururken istedigimiz dosyanin
        // dosya yolunu parametre olarak girmeliyiz

        /*
           Checked exception olusturma ihtimali olan kodlari yazdigimizda
           Java compile time orada bir hata ihtimali oldugunu gorur
           ve kodun altini kirmizi olarak cizer.

           bu durumda kirmizi cizgiyi kaldirmak icin iki yontem vardir
           1- exception'i try catch blogu ile handle etmek
           2- Javaya sorun ihtimalinin farkinda oldugumuzu ama kodumuza gouvendimizi
              ve calismaya devam etmesini istedigimi soylemek
              bunun icin method signature'na
              method deklarasyonu ile curly braces arasina
              throw keyword ve beklenen exception turu yazilir
         */
    }
}
