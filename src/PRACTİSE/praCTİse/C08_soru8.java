package praCTİse;

import java.util.Scanner;

public class C08_soru8 {/*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        int[]arr=new int[8];
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i+".indeksteki  elemani giriniz :");
            arr[i]=oku.nextInt();
            if(arr[i]%3==0){
                count++;
            }
        }
        System.out.println("3 e bolunebilen sayi :"+count);

    }
}
