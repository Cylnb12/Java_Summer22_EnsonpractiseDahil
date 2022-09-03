package PRACTİSE.java_Ornekleri;

import java.util.Scanner;

public class C14_tekrar {
    public static void main(String[] args) {
        // Kullanicidan isim ve soyismini girmesini isteyin
        // ve hangisinin daha uzun oldugunu yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz :");
        String isim=scan.nextLine();
        System.out.println("soyisim giriniz :");
        String soyisim=scan.nextLine();
        if(isim.length()>soyisim.length()){
            System.out.println("isminiz uzun");
        } else if (isim.length()<soyisim.length()) {
            System.out.println("soyisminiz uzunluktadir");

        }else{
            System.out.println("eşit uzunlıktalar");
        }


    }
}
