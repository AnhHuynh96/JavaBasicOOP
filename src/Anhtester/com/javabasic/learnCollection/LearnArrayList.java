package Anhtester.com.javabasic.learnCollection;

import java.util.ArrayList;

public class LearnArrayList {
    public static void main(String[] args) {
        //Khai bao ArrayList
        ArrayList<String> arraylist = new ArrayList<String>();

        //Them phan tu vao ArrayList
        arraylist.add("Selenium");
        arraylist.add("TestNG");
        arraylist.add("Robot");
        arraylist.add(1, "Extent Report");
        arraylist.add("");
        arraylist.add("");

        //Trim size - cat bo gia tri rong


        //Them vao voi vi tri chi dinh

        //Remove phan tu trong arrayList
        arraylist.remove("TestNG");
        arraylist.remove(1);

        //Duyet ArrayList dung ham for co ban
        for (int i = 0; i < arraylist.size(); i++) {
            System.out.println(arraylist.get(i));
        }
        System.out.println("===============");
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Playright");
        arrayList2.add("Cypress");

        //Add all arrayList2 vao arrayList1
        arraylist.addAll(arrayList2);
        for (int i = 0; i < arraylist.size(); i++) {
            System.out.println(arraylist.get(i));

        }
        //Tim kiem phan tu trong arrayList
        System.out.println("Tim kiem phan tu " + arraylist.contains("Selenium"));

        //Chuyen arrayList ve dang array
       Object[] mang = arraylist.toArray();
       for ( int i =0 ; i < mang.length; i++){
           System.out.println(mang[i]);
       }
    }
}
