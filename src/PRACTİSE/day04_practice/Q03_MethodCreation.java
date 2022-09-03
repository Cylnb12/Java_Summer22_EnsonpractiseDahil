package day04_practice;

import java.util.Scanner;

public class Q03_MethodCreation {
    public static void main(String[] args) {


         /*
  Kullanicidan alinan bir tamsayi kadar(47 den kucuk)
  FIBONACCI dizisi olusturun.
     0-1-1-2-3-5-8-13-21-34....

  */

        Scanner scan = new Scanner(System.in);
        int sinirSayi = scan.nextInt();


        fibonacci(sinirSayi);

    }

    private static void fibonacci(int sinirSayi) {

        int ilk = 0;
        int iki = 1;
        int uc = ilk + iki;


        System.out.print(ilk + " " + iki + " " + uc + " ");

        for (int i = 3; i < sinirSayi; i++) {
            ilk = iki;
            iki = uc;
            uc = ilk + iki;
            System.out.print(uc + " ");

        }


    }
}
