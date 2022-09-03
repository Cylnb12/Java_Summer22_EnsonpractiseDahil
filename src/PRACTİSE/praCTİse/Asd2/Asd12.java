package Asd2;

import java.util.Scanner;

public class Asd12 {
    public static void main(String[] args) {

        //kullanicidan baslangic ve bitis degerlerini alin
        //baslangic ve bitis degeri dahil aralarindaki tum cift sayilari
        // while loop kulanarak ekrana yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("baslangic degeri giriniz");
        int bas= scan.nextInt();
        System.out.println("bitis degeri giriniz");
        int bit= scan.nextInt();
        System.out.println("Aradaki sayilar");
        if (bas<=bit) {
            while (bas<=bit){
                if (bas%2==0){
                    System.out.print(bas+" ");
                }
                bas++;
            }

        }else {
            while (bit<=bas){
                if (bit%2==0){
                    System.out.print(bit+" ");
                }
                bit++;
            }
        }
    }
}
