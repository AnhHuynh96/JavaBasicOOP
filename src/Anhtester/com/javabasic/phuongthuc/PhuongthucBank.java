package Anhtester.com.javabasic.phuongthuc;

import Anhtester.com.javabasic.kieudulieu.Bank;

public class PhuongthucBank {
    public static void main(String[] args) {
        Bank.getBankInfo();
        double Total = (Bank.getBankInterest_Rate() * 10000000)/100;
        System.out.println(Total);
    }
}
