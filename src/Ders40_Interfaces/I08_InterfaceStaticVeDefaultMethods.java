package Ders40_Interfaces;

public interface I08_InterfaceStaticVeDefaultMethods {


    /*

       Java 8 ile Developer'larin talebi uzerine yeni bir istisnai durum javaya eklenmistir

       Bir interface'i yillar icerisinde yuzlerce calss inherit etmis olabilir
       sonradan interface'e eklenen bir abstract method tum eski child'Lar tarafindan
       inherit edilmelidir aksi takdirde tum eski child'lar CTE vericektir.

       Java 8 ile birlikte Java, interface'lere default ve static ile isaretlenmek sarti ile
       body'si olan method eklenmesine izin vermistir.
       Bu sayede interface'e sonradan eklenen method body'si oldugu icin
       override edilmek zorunda degildir.

       interface icerisinde body'si olan method olusturmak icin kullanilan
       default ve static keyword'leri arasinda tek bir fark vardir.

       default kullanilan method'lar obje olusturularak cagrilirken
       static olarak isaretlenen method'lar direkt kullanilabilir.


     */
    void method1();
    void method2();
    // interface'deki tum method'lar public ve abstract'dir.
    // biz interface'deki bir method deklarasyonuna bir default yazarsak
    // bu access modifier degildir



    public default void method3(){
        System.out.println("Interface icindeki body'li default method ");
    }
    public static void method4(){
        System.out.println("Interface icindeki body'li static method");
    }


}

