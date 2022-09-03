package day05_practice;

import java.util.Scanner;

public class Q02_ForLoop {
    public static void main(String[] args) {

         /*    Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
	        ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
	        hesaplayan kodu yazınız.
	        Örnek Ekran Çıktısı
	        Girilen sayı=4
	        Kareler toplamı=14!!!
	     */

        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen 1 den  buyuk bir say giriniz");
        int kare=0;
        int sayi= scan.nextInt();
        System.out.println("girilen sayi = "+sayi);
        for (int i = 2; i <sayi ; i++) {
            kare=(i*i)+kare;


        }
        System.out.println("Kareler toplami = "+kare);
    }
}
