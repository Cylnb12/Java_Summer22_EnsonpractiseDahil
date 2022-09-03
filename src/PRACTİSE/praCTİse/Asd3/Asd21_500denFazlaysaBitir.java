package Asd3;

import java.util.Scanner;

public class Asd21_500denFazlaysaBitir {
    public static void main(String[] args) {

        /*
        kullanicidan toplamak icin sayi isteyin toplauin
        ve toplam 500 e ulasinca veya gecince bitirelim

         */
        Scanner scan= new Scanner(System.in);
        int sayi=0;
        int toplamSayi=0;
        int sayac=0;


        do {
            sayi= scan.nextInt();
            toplamSayi+=sayi;
            sayac++;


        }while (!(toplamSayi>=500));
        System.out.println("toplamSayi = " + toplamSayi);
        System.out.println("sayac = " + sayac);


        System.out.println("----------------------");

        sayi=0;
        toplamSayi=0;
        sayac=0;

        while (toplamSayi<=500){
            sayi= scan.nextInt();
            toplamSayi+=sayi;
            sayac++;

        }
        System.out.println("toplamSayi = " + toplamSayi);
        System.out.println("sayac = " + sayac);



    }
}
