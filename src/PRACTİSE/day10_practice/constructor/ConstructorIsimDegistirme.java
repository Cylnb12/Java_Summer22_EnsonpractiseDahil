package day10_practice.constructor;

import java.util.Scanner;

public class ConstructorIsimDegistirme {

// class da body icinde sag click->
    // Generate-> kullanacagin parametreleri sec-> ok (Parametreli Constructor olusturulur)

    /*
     * - Main method icerisinde bir ogrenciye ait variable’lar olusturun ve bu
     * variable’lara atama yapin

     * - isimDegistir adinda bir method olusturun, parametre olarak ogrenci
     * bilgilerini alsin ve methodun icinde tum bilgileri degistirip, yeni
     *  bilgileri
     * yazdirsin

     * - Main method icinde isimDegistir methodunu cagirdigimiz satirin hemen
     * sonrasinda yeniden ogrenci bilgilerini yazdirin

     * -Soyisimdegistir isminde bir method olusturun, bu method parametre olarak
     *  "soyisim"
      variable'ini alsin. method'un icinde kullaniciya yeni soyisim girmesini
      istesin ve
      eski soyismi degistirsin.

     * Not :Instance variable'lar object'lere aittir ve diger adi object
     * variable'dir
     */


    String ismi;
    String soyismi;
    int numarasi;
    String sinifi;


    @Override
    public String toString() {
        return "Ogrencinin; " + "\nismi     = " + ismi + "\nsoyismi  = " + soyismi + "\nnumarasi = " + numarasi + "\nsinifi   = " + sinifi

                ;
    }

    public ConstructorIsimDegistirme(String ismi, String soyismi, int numarasi, String sinifi) {
        this.ismi = ismi;
        this.soyismi = soyismi;
        this.numarasi = numarasi;
        this.sinifi = sinifi;
    }

    public static void main(String[] args) {

        ConstructorIsimDegistirme liste = new ConstructorIsimDegistirme("Murat", "Kara", 1234, "4C");

        System.out.println(liste);
        System.out.println();

        isimDegistir(liste);
        System.out.println(liste);

        System.out.println();

        soyisimDegistir(liste);
        System.out.println(liste);
    }

    private static void soyisimDegistir(ConstructorIsimDegistirme liste) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Yeni Soyismi giriniz");
        liste.soyismi = scan.nextLine();

    }


    private static void isimDegistir(ConstructorIsimDegistirme liste) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Yeni Ismi giriniz : ");
        liste.ismi = scan.nextLine();

        System.out.print("Yeni Soyismi giriniz : ");
        liste.soyismi = scan.nextLine();

        System.out.print("Yeni Numarayi giriniz : ");
        liste.numarasi = scan.nextInt();

        System.out.print("Yeni Sinifi giriniz : ");
        liste.sinifi = scan.next();


    }


}
