package praCTİse;

import java.util.Scanner;

public class C10_soru10 {
    public static void main(String[] args) {
        // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
        String pin="mehmet.1234";
        int girisHakki=3;
        Scanner scan=new Scanner(System.in);
        System.out.println("*****HOSGELDİNİZ*******");
        while (true){
            System.out.println("pin kodunuzu giriniz :");
            String girilenPin=scan.nextLine();
            if(pin.equals(girilenPin)){
                System.out.println("Basarili giris yaptiniz");
                break;
            }else {
                System.out.println("yanlis giris yaptiniz ");
                girisHakki--;
                System.out.println("Kalan giris hakkiniz :"+girisHakki);
            }
            if(girisHakki == 0){
                System.out.println("giris hakkiniz kalmadi simblok");
                break;
            }
        }







    }
}
