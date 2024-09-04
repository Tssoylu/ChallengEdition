package Ders30_Encapsulation;

public class EChild extends DParent{

    /*
     Java'daki inheritance'in insanlardan en buyuk farki :
      insanlarda parent child edeiblir
      ama child parent'ini secemez
      Java'da ise tam tersidir
      - Siz bir class olsuturdugunuzda daha once olusturudunuguz calss'lardan
        tum ozelliklerini inherit etmek istediginiz class'i parent edinirsiniz.

        Bir class baska bir class'i inherit etmek istediginde
        extends keyword ile deklare edilir
     */

    public static void main(String[] args) {

         EChild child1= new EChild();

         child1.yas=30;
         child1.isim="Mahmut";
         child1.isEnough=false;


    }
}
