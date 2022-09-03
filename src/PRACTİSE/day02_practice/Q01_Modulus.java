package PRACTİSE.day02_practice;

import java.util.Scanner;

public class Q01_Modulus {
    public static void main(String[] args) {
        /*
         *  Kullanicidanalacaginiz 5 basamakli sayinin ilk 2
         * ve son iki basamagindaki rakamlari toplamini bulunuz
         *
         *   Ex :
         *   input  : 12345
         *   output : 12
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 5 basamakli bir sayi giriniz : ");
        int input= scan.nextInt();

        int ilkIki=input/1000;
        int sonIki=input%100;

        int ilkIkiTop=(ilkIki/10)+(ilkIki%10);
        System.out.println("ilkIkiTop = " + ilkIkiTop);
        int sonIkiTop=(sonIki/10)+(sonIki%10);
        System.out.println("sonIkiTop = " + sonIkiTop);
        System.out.println("sayilarin toplami : "+ (ilkIkiTop+sonIkiTop));



    }
}
