package day11_interviewQuestios;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

// STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
//bunu kart sifre kontrol de de kullabilirinisz

        Scanner scan=new Scanner(System.in);

        String sifre="erdal.bey123";
        int girisSayisi= 3;


        while(girisSayisi!=0){

            System.out.println( "Sifre gir lutfen");
            String girilenSifre= scan.nextLine();
            if (sifre.equals(girilenSifre)) {
                System.out.println("sifren dogru");
                break;
            }else System.out.println("sifren yanlis\n kalan hakkin "+(girisSayisi-1));
            girisSayisi--;

        }
        if (girisSayisi==0){
            System.out.println("Kart bloke islem bitti");
        }


    }
}
