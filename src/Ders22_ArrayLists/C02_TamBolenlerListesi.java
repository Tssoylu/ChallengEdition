package Ders22_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_TamBolenlerListesi {
    public static void main(String[] args) {

        // Soru- Kullanicidan pozitif tamsayi alip,
        //       o tamsayiyi bolebilen tum pozitif tamsayilari
        //       bir liste olarak bize donduren bir method olusturun


        int input= 1298;

        System.out.println(tambolenlerlistesi(input));


    }

    public static List<Integer> tambolenlerlistesi(int input){


        List<Integer> tamBolenlerListesi= new ArrayList<>();

        for (int i = 1; i <=input ; i++) {


            if (input%i==0){
                tamBolenlerListesi.add(i);

            }

        }
        return tamBolenlerListesi;
    }
}
