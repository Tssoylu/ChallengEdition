package Ders39_AbstractClass;

public abstract class BHonda extends Araba{

    // Abstract class'i parent edindigmizde iki alternatifimiz olur
    // 1- Parent'imiz olan abstract class'daki abstract method'lari override etmek
    // 2- proje yapmamiz gerekiyorsa bu class'i da abstract yapmak


    public void marka(){
        System.out.println("Marka : Honda");
    }

    public abstract void yakit();

    public abstract void guvenlik();

    public void ozelTeknoloji(){
        System.out.println("Tum Honda arabalar vitec teknolojisi kullanir");
    }
}
