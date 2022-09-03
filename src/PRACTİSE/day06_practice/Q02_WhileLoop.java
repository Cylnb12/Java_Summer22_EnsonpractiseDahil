package day06_practice;

import java.util.Scanner;

public class Q02_WhileLoop {
    public static void main(String[] args) {
        /*
         Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
        */
        Scanner scan=new Scanner(System.in);
        int numb=scan.nextInt();


        int count=0;
        while (numb > 0) {

        if (numb%2==1){
            System.out.println(numb);
            count++;
        }
        numb--;
        }
        System.out.println("count = "+count);

    }
}
