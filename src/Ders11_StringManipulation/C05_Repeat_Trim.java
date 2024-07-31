package Ders11_StringManipulation;

public class C05_Repeat_Trim {
    public static void main(String[] args) {

        String str= "Java guzeldir\n ";

        System.out.println(str.repeat(4)); // Java guzeldir Java guzeldir Java guzeldir Java guzeldir

        str="   Java guzeldir   ";

        System.out.println(str.length()); // 19

        str= str.trim();

        System.out.println(str); // Java guzeldir
        System.out.println(str.length()); // 13
    }
}
