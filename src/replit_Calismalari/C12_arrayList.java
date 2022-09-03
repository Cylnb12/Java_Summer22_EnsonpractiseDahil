package replit_Calismalari;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C12_arrayList {
    public static void main(String[] args) {
        //soru: 1 ile 1000 arasında 200 tane sayi ureten list yapın ve kullanıcıdan sayi isteyin listede var olup olmadigini soyleyen program

        Random rnd = new Random();
        List<Integer> uretilenList = new ArrayList<>();
        int sayi = 0;
        while (uretilenList.size() < 200) {
            sayi = rnd.nextInt(1000);
            if (!uretilenList.contains(sayi)) {
                uretilenList.add(sayi);
            }


        }
        System.out.println(uretilenList);

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 1 ile 1000 arasinda pozitif bir sayi giriniz");
        boolean bildiMi = false;
        while (!bildiMi) {

            int girilenSayi = scan.nextInt();

            if (uretilenList.contains(girilenSayi)) {
                System.out.println("Girdiginiz sayi listede var!!!!");
                bildiMi = true;
            } else {
                System.out.println("Girdiginiz sayi listede yok tekrar giriniz");
                bildiMi = false;
            }
        }


    }
}
