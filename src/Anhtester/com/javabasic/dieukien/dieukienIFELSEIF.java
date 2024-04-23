package Anhtester.com.javabasic.dieukien;

public class dieukienIFELSEIF {
    public static void main(String[] args) {


        int number1 = 10;
        int number2 = 20;
        String name = "FPT";
        if (number1 > 30) {
            System.out.println("Thoa dieu kien 1");
        } else if (number1 >= 20) {
            System.out.println("Thoa dieu kien 2");
        } else if (number1 >= 50) {
            System.out.println("Thoa dieu kien 3");
        } else {
            System.out.println("Khong thoa dieu kien nao ca");
        }
        int diemTB = 0;
        if(diemTB >= 8){
            System.out.println("Hoc sinh gioi");
        }else if(diemTB >= 7){
            System.out.println("Hoc sinh kha");
        }else if(diemTB >= 5 && diemTB <7){
            System.out.println("Hoc sinh TB");
        }else{
            System.out.println("Hoc sinh yeu");
        }
    }
}
