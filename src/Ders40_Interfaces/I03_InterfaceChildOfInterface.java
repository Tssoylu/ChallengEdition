package Ders40_Interfaces;

public interface I03_InterfaceChildOfInterface extends I01_Interfaces{

    // eger bir interface'i baska bir interface'in child'i yapmak istersek
    // extends keyword kullanilir.

    // bir interface concrete class'i inherit edemez.


    void metho1();
    // interface bir child parent interface'deki
    // abstract method'u override edebilir ama
    // ikisinin'de body'sinin olmadigindan
    // bu islemin anlami yoktur.

    int method4();
    boolean method5();



}
