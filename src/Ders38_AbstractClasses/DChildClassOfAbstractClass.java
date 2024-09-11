package Ders38_AbstractClasses;

public class DChildClassOfAbstractClass extends CParentAbstractClass{


    // Abstract bir class'daki abstract methodlarin tamami
    // concrete child class'lar tarafindan override edilmelidir.


    @Override
    public void mecburiMethod1() {
        System.out.println("Child class method icerisinde method'u kendine uyarlar");
    }

    @Override
    public void mecburiMethod2() {

    }
}
