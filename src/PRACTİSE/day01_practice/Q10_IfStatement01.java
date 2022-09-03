package PRACTİSE.day01_practice;

import java.util.Scanner;

public class Q10_IfStatement01 {
    public static void main(String[] args) {
        /*
         * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */


        Scanner scan=new Scanner(System.in);

        System.out.println("Y/N ?");
        char harf=scan.next().toUpperCase().charAt(0);

        if (harf=='Y'|| harf=='y'){
            System.out.println("YES");
        }else if (harf=='N'|| harf=='n'){
            System.out.println("NO");
        }else {
            System.out.println("lutfen \"YES\" icin \"Y\" ,\"NO\" icin \"N\" giriniz");
        }

        }

    }

