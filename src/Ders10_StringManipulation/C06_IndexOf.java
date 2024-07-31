package Ders10_StringManipulation;

public class C06_IndexOf {
    public static void main(String[] args) {

        String str= "Ahmet hoca ile hersey clear";

        System.out.println(str.indexOf("a")); // 9 ilk a'nin index'ini dondurur

        System.out.println(str.indexOf('c')); // 8

        System.out.println(str.indexOf("hersey")); // 15

        System.out.println(str.indexOf("e",9)); // 13

        // 13.index'deki e den bir sonraki e'nin indexini bulmak icin
        System.out.println(str.indexOf("e",14)); // 16

        // cumledeki 2. c'nin index'ini yazdirin

        int ilkcindexi= str.indexOf('c'); // 8

        System.out.println(str.indexOf('c', ilkcindexi+1)); // 22

        System.out.println(str.indexOf("ali")); // index olarak int dondurmesi bekleniyor -1

        System.out.println(str.indexOf('x')); // -1


    }
}
