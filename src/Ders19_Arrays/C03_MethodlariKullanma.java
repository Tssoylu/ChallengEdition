package Ders19_Arrays;

import Ders18_Arrays.C03_ArrayElementleriniArttirma;
import Ders18_Arrays.C04_ArrayElementleriToplama;
import Ders18_Arrays.C05_ArraydeElemanArama;
import Ders18_Arrays.C06_KullaniciyaArrayOlusturma;

import java.util.Arrays;

public class C03_MethodlariKullanma {
    public static void main(String[] args) {

        // Verilen bir int array'in elementlerini 2 arttirin


        int [] arr ={2,3,4,};

        arr = C03_ArrayElementleriniArttirma.elementleri2Arttir(arr);

        System.out.println(Arrays.toString(arr)); // [4, 5, 6]

        // arr array'inin elementlerini toplayip sonucu yazdirin

        System.out.println(C04_ArrayElementleriToplama.PozitifElementleriTopla(arr)); // 15

        // arr arry'inde 10 element olarak var mi ?

        C05_ArraydeElemanArama.elemanAra(arr,10); // Aranan sayi array'de yok

        // kullanicidan deger alarak bir array olusturun.

        int[] yeniArr =C06_KullaniciyaArrayOlusturma.arrayOlustur();

        System.out.println(Arrays.toString(yeniArr));
    }
}
