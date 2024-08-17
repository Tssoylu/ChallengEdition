package Ders22_ArrayLists;

public class C04_ForEachLoop {
    public static void main(String[] args) {

        int [] arr = {3,5,7,8,4,2,6,9,6,4,5};

        // bu array'deki 5'den buyuk olan elementleri toplayalim

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 5) {
                toplam += arr[i];

            }
        }

        System.out.println("For Loop ile : " + toplam);  // For Loop ile : 36


        // for each loop daha basit bir kurgu ile calisir
        // for-each loop'a 3 seyi soylememiz lazim
        // 1- hangi data turunde degiskenlerle ugrasicaz
        // 2- loop'un icerisinde her bir eleman geldiginde hangi isimle islem yapicaz
        // 3- hangi array veya collection'dan elemanlar gelicek

        toplam=0;

        for (int each: arr  // arr'ye git herbir int'i getir
        ) {

            if (each>5){
                toplam += each;
            }
        }

        System.out.println("For-Each Loop ile : " + toplam);  //  For-Each Loop ile : 36
    }
}
