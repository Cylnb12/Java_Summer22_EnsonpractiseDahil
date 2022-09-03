package replitCalismalari;

import java.util.Scanner;

public class C10_Ebobekok {
    public static void main(String[] args) {
        //Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.
        //Input :
        //30
        //40
        //Beklenen Cikti:
        //30 ve 40 icin GCD = 10
        //
        //30 ve 40 icin LCM = 120
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen adr arda pozitif iki tamsayi giriniz: ");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        int ebob = 0;
        if (sayi1 <= 0 || sayi2 <= 0) {
            System.out.println("lutfen pozitif tamsayi giriniz sifir veya negatif tamsayi girmeyiniz!!");
        } else if (sayi1 <= sayi2) {
            for (int i = 1; i <= sayi1; i++) {
                if (sayi1 % i == 0 && sayi2 % i == 0) {
                    ebob = i;

                }

            }
            System.out.println("verilen sayilarin EBOB'u= " + ebob);
            System.out.println("verilen sayilarin EKOK'u= " + (sayi2 * sayi1) / ebob);

        } else {
            for (int i = 1; i <= sayi2; i++) {
                if (sayi1 % i == 0 && sayi2 % i == 0) {
                    ebob = i;

                }
            }
            System.out.println("verilen sayilarin EBOB'u= " + ebob);
            System.out.println("verilen sayilarin EKOK'u= " + (sayi2 * sayi1) / ebob);

        }


    }

}




