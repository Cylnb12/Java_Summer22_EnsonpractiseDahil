package PRACTİSE.java_Ornekleri;

import java.util.Scanner;

public class C04_tekrar4 {
    public static void main(String[] args) {
        //kullanıcıdan alınan 3 basamaklı sayının okunusunuyazdıran program yaz
        Scanner scan = new Scanner(System.in);
        System.out.println("3 Basamaklı bir sayı giriniz:");
        int sayı = scan.nextInt();
        int birleBasamak = sayı % 10;
        int onlaBasamak = (sayı / 10) % 10;
        int yuzlerBasamak = sayı / 100;
        if (sayı < 100 || sayı > 999) {
            System.out.println("gecerli sayı girin");
        } else {
            switch (yuzlerBasamak) {
                case 1:
                    System.out.print("yüz ");
                    break;
                case 2:
                    System.out.print("ikiyüz ");
                    break;
                case 3:
                    System.out.print("ucyüz ");
                    break;
                case 4:
                    System.out.print("dortyüz ");
                    break;
                case 5:
                    System.out.print("besyüz ");
                    break;
                case 6:
                    System.out.print("altıyüz ");
                    break;
                case 7:
                    System.out.print("yediyüz ");
                    break;
                case 8:
                    System.out.print("sekizyüz ");
                    break;
                case 9:
                    System.out.print("dokuzyüz ");
                    break;
            }
            switch (onlaBasamak) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("on ");
                    break;
                case 2:
                    System.out.print("yirmi");
                    break;
                case 3:
                    System.out.print("otuz");
                    break;
                case 4:
                    System.out.print("kırk");
                    break;
                case 5:
                    System.out.print("elli");
                    break;
                case 6:
                    System.out.print("altmıs");
                    break;
                case 7:
                    System.out.print("yetmis");
                    break;
                case 8:
                    System.out.print("seksen");
                    break;
                case 9:
                    System.out.print("doksan");
                    break;
            }
            switch (birleBasamak) {

                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("bir ");
                    break;
                case 2:
                    System.out.print("iki");
                    break;
                case 3:
                    System.out.print("uc");
                    break;
                case 4:
                    System.out.print("dort");
                    break;
                case 5:
                    System.out.print("bes");
                    break;
                case 6:
                    System.out.print("altı");
                    break;
                case 7:
                    System.out.print("yedi");
                    break;
                case 8:
                    System.out.print("sekiz");
                    break;
                case 9:
                    System.out.print("dokuz");
                    break;

            }
        }
    }
}