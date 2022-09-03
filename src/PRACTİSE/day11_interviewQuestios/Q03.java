package day11_interviewQuestios;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        /*
Ask user enter a positive number and check if it is prime or not
Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını
kontrol edin

Kısaca asal sayılar sadece kendine ve 1'e bölünebilen pozitif tam sayılardır.
1 sayısı ise asal sayı değildir. Çünkü asal sayıların sadece 2 pozitif tam
 sayı böleni olmalıdır.
 1 ise sadece 1'e bölünebildiği için yalnız tek böleni bulunmaktadır.
 */


        Scanner scan = new Scanner(System.in);

        int sayi = scan.nextInt();

        boolean asalMi = true;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0&&sayi>2) {
                asalMi = false;
                break;

            }
            }

         if (sayi<2) {
            System.out.println("Sayi asal degil");


        }
        System.out.println(asalMi ? "Sayi asaldir" : "Sayi asal degildir");

    }
}