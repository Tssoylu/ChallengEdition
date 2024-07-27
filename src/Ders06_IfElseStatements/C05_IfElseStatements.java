package Ders06_IfElseStatements;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {

        /*
        -kullanicidan yasini isteyin, 65 yas ve uzeri ise "Emekli olabilirsin yazdirin,
        degilse emekli olmasi icin calismasi gereken yil sayisini yazdirin.
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz.");
        double yas= scan.nextInt();


        if (yas>65){
            System.out.println("Yasiniz emeklilik icin yeterli");
        }else {
            System.out.println("Emekli olmak icin " + (65-yas) + " sene daha calısmalısın.");
        }


    }
}
