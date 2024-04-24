package Anhtester.com.javabasic.learnCollection;

import java.util.*;

public class KhaiBao_SuDung {
    public static void main(String[] args) {
        //ArrayList
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Selenium");
        arrayList.add("Playright");
        arrayList.add("Cypress");
        for( int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

        System.out.println("==================");

        SortedSet<String> stringSet = new TreeSet<>();
        stringSet.add("Selenium");
        stringSet.add("akaAT Studio");
        stringSet.add("Selenium");
        stringSet.add("Katalon");

        //stringSet.stream().sorted();

        for(String str : stringSet) {
            System.out.println(str);

        }

        System.out.println("===================");
            Map<String, String> stringMap = new HashMap<>();
            stringMap.put("company", "FPT Software");
            stringMap.put("address", "Ha Noi");
            stringMap.put("address", "Ho Chi Minh");
            System.out.println(stringMap.get("address"));



    }
}
