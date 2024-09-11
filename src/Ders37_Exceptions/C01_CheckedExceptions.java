package Ders37_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_CheckedExceptions {
    public static void main(String[] args) {


        String dosyaYolu= "src/Ders36_CheckedExceptions/Deneme.txt";
        int k=0;

        try {

            FileInputStream fis=new FileInputStream(dosyaYolu);
            while ((k=fis.read())!=-1){
                System.out.print((char) k);
            }
        } catch (FileNotFoundException e) {

            System.out.println("Dosya yolu yalnis veya dosya arizali");
        } catch (IOException e) {

            System.out.println("Dosya okuma veya yazma ile ilgili bir sorun var");
        }

        /*
           Bir kod calisirken birden fazla exception olusma ihtimali varsa
           bu kodu'u calisir hale getirmek icin 4 ihtimal vardir

           -1 her bir exception icin ic ice try catch bloklari kullanmak

           -2 bir tane try blog'u bir den fazla chatch blog'u kullanmak

           -3 method signature'na tum exception ihtimalini yazmak (exception handle edilmis olmaz)

           -4 eger muhtemel exception'larin tumunu kapsayan, daha genis bir exception varsa onu kullanmak

           2. ve 3. ihtimallederde olusmasi muhtemel exception'lar arasinda
           parent-child iliskisi olup olmadigi kontrol edilmelidir.
           aralarinda parent-child iliskisi yoksa
           exception'lari istedigimiz sirada yazabiliriz

           Ancak parent-child iliskisi varsa once child sorna parent yazilmalidir
           aksi takdirde parent daha kapsamli oldugundan tum exception'lari yakalar
           ve child exception islvesiz kalir
           java bu durumu kabul etmez, CTE verir.

         */
    }
}
