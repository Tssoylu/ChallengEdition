package Ders19_Arrays;

import java.util.Arrays;

public class c01_ElemanlariSagaKaydirma {
    public static void main(String[] args) {

        // Soru- Verilen bir array'deki tum elementleri bir saga kaydirip
        // sondaki elementi de basa tasiyacak bir method olusturun, array'i yeni haliyle kaydedin.
        // orn : input : [4,5,6,7] array'in son hali : [7,4,5,6]

        int[] arr= {4,5,6,7,8,9};

        arr= SagaKaydir(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static int[] SagaKaydir(int[] arr) {

        int bosKova = arr[arr.length - 1]; // son elementi bos kovaya koyduk.

        for (int i = arr.length - 2; i >= 0; i--) {

            arr[i+1] = arr[i];
        }
        arr[0]=bosKova;

        return arr;
    }
}
