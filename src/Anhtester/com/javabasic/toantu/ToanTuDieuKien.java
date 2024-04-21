package Anhtester.com.javabasic.toantu;

public class ToanTuDieuKien {

        public static void main(String[] args) {
            int a = 20;
            int b = 3;
            String expectedText = "Login"; //Data cứng Excel
            String actualText = "Logi"; //Data lấy bằng Selenium với //driver.findElement(HeaderHomePage).getText()
            String buttonExpectedColor = "#12345"; // mã màu hoặc điền data cứng hoặc lấy file excel, csv,json,...
            String buttonActualColor = ""; // Lấy bằng auto với Selenium

            String s = (a % b == 0) ? "a chia het cho b" : "a khong chia het cho b";
            System.out.println(s);

            String s1 = (expectedText == actualText) ? "Test case pass" : "Test case fail. Text tren button khong dung";
            System.out.println(s1);
        }

}
