package Anhtester.com.javabasic.toantu;

public class ToanTuSoHoc {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        boolean checkValue1 = (a > 1) & (b < 2); //false điều kiện và
        boolean checkValue2 = (a > 1) || (b < 2); //true điều kiện hoặc
        String expectedText = "Login"; //Data cứng Excel
        String actualText = "Login"; //Data lấy bằng Selenium với //driver.findElement(HeaderHomePage).getText()
        String buttonExpectedColor = "#12345"; // mã màu hoặc điền data cứng hoặc lấy file excel, csv,json,...
        String buttonActualColor = ""; // Lấy bằng auto với Selenium


        System.out.println(checkValue1);
        System.out.println(checkValue2);
        System.out.println((expectedText == actualText) & (buttonExpectedColor == buttonActualColor));
        System.out.println("Phan du cua b chia a la: " + b % a);

    }
}
