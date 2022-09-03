package replit_Calismalari;

import java.util.Scanner;

public class C05_DoWhileLoop {
    public static void main(String[] args) {
        //Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0’a basmasini
        //soyleyin.
        //Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin ve “Negatif sayi
        //giremezsiniz” yazdirip basa donun
        //Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini, yanlislikla kac negative sayi
        //girdigini ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
        Scanner scanner = new Scanner(System.in);
        int sayi=0;
        int pozSayiadedi=0;
        int negSayiAdedi=0;
        int sayilaToplami=0;
        do{
            System.out.println("lütfen pozitif sayilar giriniz,işlemi bitirmek için 0 a basiniz. ");
            sayi= scanner.nextInt();
            if(sayi<0){
                System.out.println("Negatif sayi giremezsiniz");
                negSayiAdedi++;
            }else if(sayi>0){
                sayilaToplami+=sayi;
                pozSayiadedi++;
            }

        }while (sayi!=0);
        System.out.println("Toplam "+pozSayiadedi+"  sayi girdiniz,yanlişlikla "+negSayiAdedi+" negatif sayi girdiniz.Ve girdiğiniz pozitif sayilar toplami:"+sayilaToplami+" dir.");




    }
}
