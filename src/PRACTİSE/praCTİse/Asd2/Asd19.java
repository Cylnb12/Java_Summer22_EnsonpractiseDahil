package Asd2;

import java.util.Scanner;

public class Asd19 {
    public static void main(String[] args) {

        /*
        kullanicidan pozitif tam sayilar isteyin
        islemi bitirmek icin 0 basmasini soyleyin

        kullanici 0 bastigindatoplam kac pozitif tam sayi girdigini
        ve pozitif tam sayilarin toplaminin kac oldugunu yazdirin

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen toplamak istediginiz pozitif tam sayilari giriniz\n" +
                "islemi bitirmek icin 0 a basiniz");

        int pozTamSayTop=0;
        int pozTamSaySay=0;
        int negGirSay=0;
        int sayi=0;

        do {
            sayi= scan.nextInt();
            if (sayi>0){
                pozTamSayTop+=sayi;
                System.out.println("simdiye kadar girien sayilarin toplami : "+ pozTamSayTop);
                pozTamSaySay++;


            } else if (sayi<0) {
                System.out.println("pozitif sayi giriniz");
                negGirSay++;

            }



        }while (sayi!=0);
        System.out.println("pozTamSayTop = " + pozTamSayTop);
        System.out.println("Yanlislikla Negatif girilen sayi Adedi = " + negGirSay);
        System.out.println("pozTamSaySay = " + pozTamSaySay);
    }
}
