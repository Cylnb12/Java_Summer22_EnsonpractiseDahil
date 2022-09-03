package day02_practice;

import java.util.Scanner;

public class Q04_NotHesaplama {
    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz vize2 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */

        Scanner scan=new Scanner(System.in);

        System.out.println("1. vize notunu giriniz");
        int vize1= scan.nextInt();
        System.out.println("2. vize notunu giriniz");
        int vize2= scan.nextInt();
        System.out.println("Final notunu giriniz ");
        int sonNot= scan.nextInt();

        double islem=(vize1+vize2)/2*30/100+sonNot*70/100;

        System.out.println("Gecme notunuz : "+islem);

    }
}
