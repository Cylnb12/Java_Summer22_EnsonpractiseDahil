package day01_practice;

import java.util.Scanner;

public class Q08_Scanner01 {
    public static void main(String[] args) {
// kullanicidan 2 tam sayi alin
        // bu tam sayilari toplayin ve sonucu yazdirin

       Scanner scan=new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz: ");
        int sayi1= scan.nextInt();
        System.out.print("ikinci sayiyi giriniz: ");
        int sayi2= scan.nextInt();

        System.out.println("iki sayinin toplami : "+(sayi1+sayi2));
    }
}
