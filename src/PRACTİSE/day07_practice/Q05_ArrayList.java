package day07_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Q05_ArrayList {

    /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
     *  1. Kullanicidan ismini isteyelim
     *  2. Kullanici adindaki bosluklari silelim.
     *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
     *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
     *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.

     */
    public static void main(String[] args) {

        Random rnd=new Random();
        int sayi= 0;

        List<String> isimList=new ArrayList<>();

        Scanner scan=new Scanner(System.in);

        String kullaniciIsmiBsuz="";

        do {
            System.out.println("Kullanici ismini giriniz ");
            String kullaniciIsmi=scan.nextLine();
            kullaniciIsmiBsuz=kullaniciIsmi.replaceAll("\\s","");

            sayi = rnd.nextInt(1000);
            if (!isimList.contains(kullaniciIsmiBsuz)) {
                isimList.add(kullaniciIsmiBsuz);
            } else {
                isimList.add(kullaniciIsmiBsuz +sayi);
            }


        }while(!kullaniciIsmiBsuz.equalsIgnoreCase("X"));
        System.out.println(isimList);







    }
}
