package Anhtester.com.javabasic.variables;

import java.sql.SQLOutput;

public class StaticVariables {
    public static String ten ="Kim Anh";
    int tuoi = 20;// bien toan cuc
    static int age = 30; // bien static
    public static void main(String[] args) {
        System.out.println("Tuoi :" + age);
        StaticVariables abc = new StaticVariables();
        System.out.println("Tuoi :" + abc.tuoi);
        System.out.println("My name is " + ten);
        System.out.println("Ten toi la " + StaticVariables.ten);
    }

}
