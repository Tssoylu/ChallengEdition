package Ders40_Interfaces;

public class I02_ConcereChildClassOfInterface implements I01_Interfaces {

    // Bir class'i bir interface'in child'i yapmak icin implements keyword kullanilir.

    public static void main(String[] args) {

        System.out.println(MESAJ); // Hello Interface
        // sayi=40; yazili olmasa da interface icerisinde oldugundan
        //          final'dir ve atama yapilamaz

        System.out.println(Integer.MAX_VALUE);
        // Normalde variable isimler kucuk harfle baslar ve camelCase kullanilir
        // anca java'da ortak kabul olarak
        // static ve final olarak isaretlenen variable isimleri tamamen buyuk harf ile yazilir


        System.out.println(Math.PI);
    }

    @Override
    public void metho1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }
}
