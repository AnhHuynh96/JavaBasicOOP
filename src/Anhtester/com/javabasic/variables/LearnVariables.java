package Anhtester.com.javabasic.variables;

public class LearnVariables {

    static int age = 26; // bien toan cuc
    static int number = 20;
    public static void sayHello(){
        int n =10;
        System.out.println("Gia tri cua n la:" + n );
        System.out.println(number);
    }
    public static void main(String[] args) {
        System.out.println(age);
        System.out.println(number);

        LearnVariables abc = new LearnVariables();
        abc.sayHello();
        sayHello();
    }
}
