package Anhtester.com.javabasic.mang;

public class MangMotChieu {
    public static void main(String[] args) {
        //Khai bao mang
        int songuyen[] = new int[20];
        //Them gia tri vao mang
        songuyen[0] = 5;
        songuyen[2] = 10;
        songuyen[19] = 30;

        //In gia tri trong mang theo thu cong tung vi tri

        //System.out.println(songuyen[0]);
        //System.out.println(songuyen[2]);
        //System.out.println(songuyen[1]);
        //System.out.println(songuyen[19]);
        //Do dai mang
        System.out.println("Do dai mang " + songuyen.length);

        //Duyet phan tu trong mang voi vong lap for
        //Nho dung lai voi gia tri < do dai cua mang do. Vi no bat dau tu 0
        for (int i = 0; i < songuyen.length; i++) {
            System.out.println(songuyen[i]);
        }
        //Them gia tri vao mang thong qua vong lap for
        for (int i = 0; i < songuyen.length; i++) {
            if (i % 2 == 0) {
                songuyen[i] = 10;
            }
        }
            for (int i = 0; i < songuyen.length; i++) {
                System.out.println(songuyen[i]);

            }


    }
}
