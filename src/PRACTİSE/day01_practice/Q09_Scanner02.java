package day01_practice;

import java.util.Scanner;

public class Q09_Scanner02 {
    public static void main(String[] args) {
// kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
        // ve yasadiklari yeri seviyorlarsa
        // bu bilgiyi yazdirin

        // next() only can read the first word
        // nextLine() can read the whole line

        Scanner scan=new Scanner(System.in);
        System.out.print("Istenen bilgileri giriniz ; \n Ad : ");
        String ad=scan.nextLine();

        System.out.print("Soyad : ");
        String soyad=scan.nextLine();

        System.out.print("Memleket : ");
        String memleket= scan.nextLine();

        System.out.print("Su anki konum : ");
        String konum=scan.nextLine();

        System.out.print("Yas : ");
        int yas= scan.nextInt();

        System.out.print("boy : ");
        double boy=scan.nextDouble();

        System.out.print("Yasadiginiz yeri seviyor musunuz?\n seviyorsaniz \"True\" sevmiyorsaniz \"False\" giriniz ");
        boolean seviyorMu=scan.nextBoolean();



        System.out.println("Yasadiginiz konum "+konum+" u seviyor musunuz \n true/false?");

        System.out.println("ad         : " + ad);
        System.out.println("soyad      : " + soyad);
        System.out.println("boy        : " + boy);
        System.out.println("yas        : " + yas);
        System.out.println("seviyorMu  : " + seviyorMu);

    }
}
