package Ders30_Encapsulation;

public class AEncapsuleClass {


    private String hastaneIsmi="Yildiz Hastanesi";
    // hastane ismi gorulebilsin ama degistirilemesin istiyoruz
    // getter method'u lazim

    public String getHastaneIsmi() {
        return hastaneIsmi;
    }

    private int hastaUcreti;
    // hasta ucretleri giris yapilabilsin ama
    // ucreti sigortadan alinicagi icin
    // personel hasta ucretlerini goremesin
    // setter method'u lazim


    public void setHastaUcreti(int hastaUcreti) {
        this.hastaUcreti = hastaUcreti;
    }

    private String hemsireIsmi;
    private String hemsireAdresi;
    // Bu instance variable'lara herkes ulasabilir.
    // bu durumda public yapmak akla gelen ilk cozum olacaktir

    // bu variable'lari public yapmak yerine
    // private yapip, getter ve setter olsuturmak da
    // ayni islevi gorur


    public String getHemsireIsmi() {
        return hemsireIsmi;
    }

    public void setHemsireIsmi(String hemsireIsmi) {
        this.hemsireIsmi = hemsireIsmi;
    }

    public String getHemsireAdresi() {
        return hemsireAdresi;
    }

    public void setHemsireAdresi(String hemsireAdresi) {
        this.hemsireAdresi = hemsireAdresi;
    }
}
