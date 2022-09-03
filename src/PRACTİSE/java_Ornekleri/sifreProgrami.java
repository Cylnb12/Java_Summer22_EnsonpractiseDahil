package PRACTİSE.java_Ornekleri;

import java.util.Scanner;

public class sifreProgrami {
    public static void main(String[] args) {
        // Soru 6) Kullanicidan bir sifre girmesini isteyin.
        //        Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        //        sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        //        - Ilk harf buyuk harf olmali
        //        - Son harf kucuk harf olmali
        //        - Sifre bosluk icermemeli
        //        - Sifre uzunlugu en az 8 karakter olmali
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sifre giriniz");
        String sifre = scan.nextLine();
        int kontrol = 0;
        // ilk harf kontrolu
        if (sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z') {
            kontrol++;
        } else {
            System.out.println("Ilk harf buyuk harf olmali");
        }
        // son harf kontrolu
        if (sifre.charAt(sifre.length() - 1) >= 'a' && sifre.charAt(sifre.length() - 1) <= 'z') {
            kontrol++;
        } else {
            System.out.println("Son harf kucuk harf olmali");
        }
        // bosluk kontrolu
        if (sifre.contains(" ")) {
            System.out.println("Sifre bosluk icermemeli");
        } else {
            kontrol++;
        }
        // sifre uzunluk kontrolu
        if (sifre.length() >= 8) {
            kontrol++;
        } else {
            System.out.println("Sifre en az 8 karakter olmali");
        }
        if (kontrol == 4) {
            System.out.println("Sifre basari ile tanimlandi");
        } else {
            System.out.println("Islem basarisiz,Lutfen yeni bir sifre girin");
        }
        // String str1="$13,99";
        // String str2="$10,55";
        // str1=str1.replaceAll("\\D","");
        // double sayi1=Double.parseDouble(str1);
        // str2=str2.replaceAll("\\D","");
        // double sayi2=Double.parseDouble(str2);
        // System.out.println("$"+(sayi1+sayi2)/100);


    }
}
