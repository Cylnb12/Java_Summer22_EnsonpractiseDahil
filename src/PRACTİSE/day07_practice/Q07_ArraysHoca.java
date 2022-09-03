package day07_practice;

import java.util.Arrays;
import java.util.Scanner;

public class Q07_ArraysHoca {
    public static void main(String[] args) {


        farkiniBul();
    }

    private static void farkiniBul() {

        Scanner scan=new Scanner(System.in);
        System.out.println("Array uzunlugunu giriniz ");
        int uzunluk= scan.nextInt();
        int arr[] =new int[uzunluk];

        for (int i = 0; i < uzunluk; i++) {
            System.out.println("Array in "+i+1+". elemanini giriniz");
            arr[i]=scan.nextInt();

        }
        int max=arr[0];
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(" farki "+(max-min));

        Arrays.sort(arr);
        System.out.println("Array deki en buyuk eleman ile en kucuk eleman arasindaki fark = "+(arr[uzunluk-1]-arr[0]));


        // bu soruyu Math class i kullanarak cozun
    }
}
