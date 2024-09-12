package Ders39_AbstractClass;

public abstract class Araba {

    // araba class'ini inherit eden tum class'lar
    // motor,marka kasa ve tekerlek method'larini override etmek zorunda kalsın
    // ancak abs ve klima opsiyonel olsun
    // isteyen child bu method'lari override etsin, istemeyen override etmesin


    public abstract void motor();

    public abstract void marka();

    public abstract void kasa();

    public abstract void tekerlek();

    public void abs(){
        System.out.println("Guvenlik arttirmak isteyen araclar abs kullanmali");
    }

    public void klima(){
        System.out.println("Konfor arttirmak isteyen araclar klima kullanmali");
    }
}
