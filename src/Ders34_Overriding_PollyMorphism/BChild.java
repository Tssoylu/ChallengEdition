package Ders34_Overriding_PollyMorphism;

public class BChild extends AParent{

    public void method1(){
        System.out.println("Child class method1");
    }
    public void method2(int a){
        // overriding olabilmesi icin
        // hem method ismi,hem de method signature ayni olmali
        System.out.println("child class method2");
    }
    public void method2(String isim){
        System.out.println("Child class String parametreli method2");
    }

    @Override
    public void method3() {
        // super.method3();
        // overriding varsa parent ve child class'daki
        // overridden ve overriding method'lardan sadece biri calisir
        // eger ikisini birden calistirmak istersek
        // super.overriddenMethodIsmi yazilir.

        /*
           Overriding method @Override notsayonu ile isaretlenebilir
           @Override kullanilmayan overriding isleminde,
           parent calss'daki overridden method silinirse
           hic bir sorun olmaz

           Ancak @Override kullanilan overriding isleminde,
           parent class'daki overridden method silinirse
           veya signature'i degistirilirse
           Java CTE verir, boylece overridden method'un
           silinmesi engellenir.
         */
    }
}
