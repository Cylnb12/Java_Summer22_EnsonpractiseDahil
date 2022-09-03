package day03_practice;

import java.util.Scanner;

public class Q05_StringManipulation {
    public static void main(String[] args) {


        //Kullanicidan ismini ve soyisimi girmesini isteyin,
        // sonrasinda konsola tam ismini buyuk harfler ile yazdirin


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi ve soyisminizi girinizgiriniz");
        String isim=scan.nextLine().toUpperCase();
        System.out.println();
        String soyisim=scan.nextLine().toUpperCase();
        String fullName=isim.concat(" "+ soyisim);

        System.out.println("fullName = " + fullName);


    }
}
