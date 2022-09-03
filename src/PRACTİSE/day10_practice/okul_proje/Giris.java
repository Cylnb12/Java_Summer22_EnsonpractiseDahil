package day10_practice.okul_proje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Giris {
    /*
        * ogretmen bilgilerini kullanicidan aliniz
        * aldiginiz bilgilerrden object ureterek yeni
         ogretmenler olusturun ve bilgilerini yazdirin
        */
    static Scanner scan = new Scanner(System.in);//TODO STATIC TANIMLA

    static List<OgretmenBilgileri> ogretmenList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("===== OKULUMUZA HOSGELDINIZ ====");


        System.out.println("Isim Giriniz");
        String isim = scan.nextLine();

        System.out.println("soyisim giriniz");
        String soyisim = scan.nextLine();

        System.out.println("yasinizi giriniz");
        int yas = scan.nextInt();

        scan.nextLine();

        System.out.println("Bransinizi giriniz");
        String brans = scan.nextLine();


        scan.nextLine();//Dummy hayalet komut

        System.out.println("telefon no giriniz");
        String tel = scan.nextLine();


        OgretmenBilgileri adayOgretmen = new OgretmenBilgileri(isim, soyisim, yas, brans, tel);


        ogretmenList.add(adayOgretmen);

        System.out.println("ogretmenList = " + ogretmenList);

    }


}
