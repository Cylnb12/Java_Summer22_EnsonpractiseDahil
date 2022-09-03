package praCTİse;

import java.util.Scanner;

public class C01_soru1 {
    public static void main(String[] args) {//debugging
        //girilen sayinin basamaklarindaki rakamlarin toplamini bulunuz
        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();
        basamakToplama(sayi);

        System.out.println(basamakToplama(sayi));

    }

    public static int basamakToplama(int sayi) {
        int toplam = 0;
        while (sayi != 0) {

            toplam += sayi % 10;
            sayi /= 10;

        }
        return toplam;

    }
}
