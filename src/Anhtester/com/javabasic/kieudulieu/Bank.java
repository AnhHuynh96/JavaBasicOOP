package Anhtester.com.javabasic.kieudulieu;

import java.sql.SQLOutput;

public class Bank {
    static int num1 = 123456;
    static String BankName = "TienPhongBank";
    static String ADDRESS ="Ninh Kieu, Can Tho";
    static float INTEREST_RATE = 7.3F;
    public static void getBankInfo(){
        System.out.println("Ten ngan hang: " + BankName);
        System.out.println("Dia chi: " + ADDRESS);
        System.out.println("Lai suat: " + INTEREST_RATE);
    }
    public static float getBankInterest_Rate(){
        return INTEREST_RATE;
    }

}
