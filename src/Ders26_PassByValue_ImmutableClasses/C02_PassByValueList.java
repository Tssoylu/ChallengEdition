package Ders26_PassByValue_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C02_PassByValueList {
    public static void main(String[] args) {


        // bir method olusturalim ve method'da list'deki sayilari 5 arttiralim.
        // ve method'da listenin son halini yazdiralim.

        List<Integer> sayilar= new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);

        elementleri5Arttir(sayilar);
        elementleri5Arttir(sayilar);
        elementleri5Arttir(sayilar);

        // main method icinde sayilari tekrar yazdiralim

        System.out.println("Method sonrasi main method'da list : " + sayilar);

    }

    public static void elementleri5Arttir(List<Integer> sayilar){

        for (int i = 0; i < sayilar.size() ; i++) {

            sayilar.set(i,sayilar.get(i)+5);
        }
        System.out.println(sayilar);
    }

}
