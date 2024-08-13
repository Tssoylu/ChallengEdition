package Ders21_ArrayList;

import java.util.*;

public class C04_ArraydenTekrarlariSilme {
    public static void main(String[] args) {

        // Verilen bir array'deki tekrar eden sayilari
        // bir kere olucak sekilde array'i duzenleyin

        int[] arr = {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};

        // bu soruyu array'le yapmak cok zor
        // bunun yerine bu array'in elemanlarini tek tek inceleyip
        // tekrarsiz olanlari bir list'e atalim

        List<Integer> tekrarsizListe = new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {

            if (!tekrarsizListe.contains(arr[i])){
                tekrarsizListe.add(arr[i]);
            }
        }

        System.out.println("tekarsiz liste : " + tekrarsizListe);
        // en son o list'deki elementleri iceren bir array olusturup
        // yeni array'i eski array'e deger olarak atayalim
        

    }
}
