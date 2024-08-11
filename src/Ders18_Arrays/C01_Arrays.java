package Ders18_Arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        int[] arr1= {2,4,6,8,10};

        // array'İn bir elementine ulasmak ve update etmek istersek.

        System.out.println(arr1[2]); // 6

        arr1[3]=20;

        System.out.println(arr1[3]); // 20

        System.out.println(arr1.length); // 5

        // son elementi yazdirin

        System.out.println(arr1[arr1.length-1]); // 10

        // array'in tum elementlerini yazdirin

        for (int i = 0; i < arr1.length ; i++) {
            System.out.print(arr1[i] + " ");
        }

        // array'in uzunlugu sonradan degistirilmez
        // System.out.println(arr1[5] = 35); //Index 5 out of bounds for length 5 hatasi verir
        // eger array'de olmayan bir index'e atama yapmak istersek IndexOutOfBoundsException hatasi verir.
        // bu hata Compile Time Error CTE degil
        // Run time error'dur.








    }
}
