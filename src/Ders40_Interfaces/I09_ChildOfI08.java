package Ders40_Interfaces;

import java.util.ArrayList;
import java.util.List;

public class I09_ChildOfI08 implements I08_InterfaceStaticVeDefaultMethods{

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }


    public static void main(String[] args) {

        List<String> isimler= new ArrayList<>();

        I09_ChildOfI08 obj=new I09_ChildOfI08();
        obj.method3();

        I08_InterfaceStaticVeDefaultMethods.method4();

    }
}
