package day06_practice;

import java.util.Scanner;

public class Q01_WhileLoop {
    public static void main(String[] args) {

        // girilen sayının basamaklarındaki rakamların toplamını bulunuz.

        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();

        int bBToplam=0;

        int temp=a;


        while (a>0){

            bBToplam+=a%10;

            a/=10;



        }
        System.out.println(bBToplam);


    }
}
