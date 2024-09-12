package Ders39_AbstractClass;

public class CHondaCivic extends BHonda{
    @Override
    public void yakit() {
        System.out.println("Civic araclar benzinlidir");
    }

    @Override
    public void guvenlik() {
        System.out.println("Civic araclar guvenlik standardina uyar");
    }

    @Override
    public void motor() {
        System.out.println("Honda Civic araclar vtec teknolojili cevreci motorlar kullanir");
    }

    @Override
    public void kasa() {
        System.out.println("Civic araclar sedan veya hb kasa kullanir");
    }

    @Override
    public void tekerlek() {
        System.out.println("Civic araclar 205*16*55 teker kullanir");
    }

    @Override
    public void abs() {
        System.out.println("Honda Civic arabalar standart olarak abs kullanir");
    }

    @Override
    public void klima() {
        System.out.println("Honda Civic arabalar standart olarak klimalari kullanir");
    }

    public static void main(String[] args) {

        CHondaCivic civic1= new CHondaCivic();

        /*
           Abstract parent class'lardaki abstract method'lar
           concrete child class'lar tarafindan mecbur override edilir

           Ancak abstract parent'lardaki concrete method'lari
           override etmek mecburi degildir
           eger child class'a uyarlamak istersek override edebiliriz
           veya override etmeyip parent class'daki haliyle kullanabiliriz

         */

        civic1.abs(); // Araba
        civic1.klima(); // Araba
        civic1.marka(); // Honda
        civic1.ozelTeknoloji(); // Honda

    }
}
