package Ders37_Exceptions;

public class C07_TryCatch {
    public static void main(String[] args) {

        try {
            calıs();
        } catch (Exception e) {
            // System.out.println(e.getMessage());
        }
    }
    private static void calıs(){
        throw new RuntimeException("coook calis");

    }

}
