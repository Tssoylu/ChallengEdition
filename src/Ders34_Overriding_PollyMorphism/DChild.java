package Ders34_Overriding_PollyMorphism;

public class DChild extends CParent{

    // Overriding kurallari:
    // 1- access modifier method signatur'a dahil olmadigindan
    // overridden ve overridingaccess modifier'lar farkli olabilir
    // child parent'i sinirlandiramaz
    // yani overriding method'un access modifier
    // ayni veya daha genis kapsamli olmalidir
    // private -- default -- protected -- public
    public void method1(){

    }


    // 2- private ve static method'lar override edilemez
    // ayni isimde method olusturunca Java CTE vermez
    // ancaoverride isareti cikmaz ve
    // @Override, notasyonu kullanilmak istenirse CTE olur
    // yani Java bunlari farkli class'lardaki farkli method'lar olarak kabul eder.


    protected static void method2(){

    }

    private void method3(){

    }

    // 3- return type method signature'ina dahil olmadigindan
    // farkli secilebilir ancak
    // return type void veya primitive ise ayni olmak zorundadir
    // Eger return type'lar non-primitive ise
    // Child class'daki return type, parent class'daki return type'i
    // ile ayni veya child'i olmalidir.

    public void method4(){

    }

    public Integer method5(){

        return 5;
    }
}
