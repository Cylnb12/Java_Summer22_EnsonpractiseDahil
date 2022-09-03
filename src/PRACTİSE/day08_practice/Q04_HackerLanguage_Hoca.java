package day08_practice;

import java.util.Scanner;

public class Q04_HackerLanguage_Hoca {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println(" Bir cumle giriniz");
        String cumle=scan.nextLine().toLowerCase();

        hackerDili(cumle);
    }

    private static void hackerDili(String cumle) {

        String [] arr=new String[cumle.length()];
        for (int i = 0; i < cumle.length(); i++) {
            arr[i]=cumle.substring(i,i+1);


            if (arr[i].contains("s")){arr[i]="5";}
            if (arr[i].contains("a")){arr[i]="4";}
            if (arr[i].contains("e")){arr[i]="3";}
            if (arr[i].contains("i")){arr[i]="1";}
            if (arr[i].contains("o")){arr[i]="0";}
        }
        System.out.println();


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
