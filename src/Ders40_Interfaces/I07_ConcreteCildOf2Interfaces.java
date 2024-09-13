package Ders40_Interfaces;

public class I07_ConcreteCildOf2Interfaces implements I05_Interface,I06_Interface{


    /*
       1- Bir class sadece bir class'a extends edilebilir
          anca birden fazla interface'e implements edilebilir
       2- Concrete child class implement ettigi tum interface'lerdeki
          abstract method'lari override etmek zorunda oldugundan
          iki interface'deki tum method'lari override etmek gerekir

          - iki interface de ayni isim ve ayni return type'a sahip
            method'lardan hangisini override ettigi onemli degildir
          - Ancak isimler ayni return type'lar farkli oldugunda
            iki interface'i birden implement etmemiz mumkun olmayacaktir
          - bu durumda ya child class'dan bu iki interface'i implement etmketen vazgecmeliyiz
          - veya sisteme mudahale imkanimiz varsa bu karsikligi cozmeliyiz.

        3- child class'dan parent Interface'lerdeki variable'lari kullanmak istersek
         - ayni isimde iki interface'de de variable varsa, tercihimizi belirtmeliyiz
         - interfaceIsmi.variableIsmi seklinde tercihimizi belirtmelyiz
         - kullanicagimiz variable sadece bir interface'de varsa
           sadece variable ismi yazmak yeterli olacaktir.


     */

    public static void main(String[] args) {
        System.out.println(I06_Interface.MESAJ);
        System.out.println(I05_Interface.SAYİ);
        System.out.println(SAYİ2);

    }



    @Override
    public void metho1() {

    }

    @Override
    public void method1() {

    }

    @Override
    public String  method2() {
        return null;
    }

    @Override
    public int method4() {
        return 0;
    }

    @Override
    public String method3() {
        return "";
    }
}
