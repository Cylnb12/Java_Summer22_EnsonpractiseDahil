package day06_practice;

public class Q08_Arrays {
    public static void main(String[] args) {
         /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */

        int[] arr={5,7,-6,4,2,15,3,8,};

        int count=0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]%3==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
