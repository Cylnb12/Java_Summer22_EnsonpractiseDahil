package day06_practice;

import java.util.Scanner;

public class Q11_Odev {
    public static void main(String[] args) {
        // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.


        Scanner scan=new Scanner(System.in);


        String pin="123456";
        String input="";
        int hak=0;

        do {

            System.out.println("Lutfen pin kodunuzu giriniz ");
            input=scan.next();
            if (input.equals(pin)){
                System.out.println("Gecerli pin girildi\n Hosgeldiniz");
                break;
            }else {
                System.out.println("Sifreniz gecerli degil\nLutfen tekrar deneyiniz");
                hak++;

                System.out.println();
                if (3-hak!=0) {
                    System.out.println(3 - hak + "giris hakkiniz kaldi");
                }else System.out.println("!!!Bloklandiniz!!!");

            }

        }while (hak!=3);



    }
}
