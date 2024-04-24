package Anhtester.com.javabasic.mang;

public class LuuSoChan {
    public static void main(String[] args) {
        //Mang 1 tao so tu 1-50
        int mang1[] = new int[50];
        int mang2[] = new int[50];
        for (int i = 0; i < mang1.length; i++) {
            mang1[i] = i + 1;
        }
        for (int i = 0; i < mang1.length; i++) {
            System.out.println(mang1[i]);

            //Mang 2 luu nhung gia tri so chan
            if (mang1[i] % 2 == 0) {
                mang2[i] = mang1[i];
            }
        }

        for (int i = 0; i < mang2.length; i++) {
            System.out.println(mang2[i]);
        }
    }
}

