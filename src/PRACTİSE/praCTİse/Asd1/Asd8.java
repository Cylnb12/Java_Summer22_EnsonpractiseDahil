package Asd1;

import java.util.Scanner;

public class Asd8 {
    public static void main(String[] args) {


        /*
        Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.

Input : 6

Output: 6!=65432*1=720
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("bir tam sayi giriniz");
        int input= scan.nextInt();
        int depo=1;
        for (int i = 1; i <=input ; i++) {
            depo*=i;



        }

        System.out.println(input+ " sayisinin faktoryeli  = "+depo);

    }
}
