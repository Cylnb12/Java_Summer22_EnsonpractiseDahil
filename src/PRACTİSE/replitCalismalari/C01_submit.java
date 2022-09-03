package replitCalismalari;

import java.util.Locale;
import java.util.Scanner;

public class C01_submit {
    public static void main(String[] args) {
        /*Bir aydaki gün sayısını hesaplayan bir Java programı yazınız.

                INPUT:

        Ay Numarasi:

        2

        Yil :

        2016

        OUTPUT :

        Subat 2016 29 Gundur.*/

        int gun1 = 28;
        int gun2 = 29;
        int gun3 = 30;
        int gun4 = 31;

        int ayNumarasi = 2;
        int yil = 2015;
        if (yil % 4 == 0) {
            switch (ayNumarasi) {
                case 1:
                    System.out.println("Ocak " + yil + " " + gun4+" Gundur.");
                    break;
                case 2:
                    System.out.println("Subat " + yil + " " + gun2+" Gundur.");
                    break;
                case 3:
                    System.out.println("Mart " + yil + " " + gun3+" Gundur.");
                    break;
                case 4:
                    System.out.println("Nisan " + yil + " " + gun3+" Gundur.");
                    break;
                case 5:
                    System.out.println("Mayis " + yil + " " + gun4+" Gundur.");
                    break;
                case 6:
                    System.out.println("Haziran " + yil + " " + gun3+" Gundur.");
                    break;
                case 7:
                    System.out.println("Temmuz " + yil + " " + gun4+" Gundur.");
                    break;
                case 8:
                    System.out.println("AGUSTOS " + yil + " " + gun4+" Gundur.");
                    break;
                case 9:
                    System.out.println("Eylul " + yil + " " + gun3+" Gundur.");
                    break;
                case 10:
                    System.out.println("Ekim " + yil + " " + gun4+" Gundur.");
                    break;
                case 11:
                    System.out.println("Kasım " + yil + " " + gun3+" Gundur.");
                    break;
                default:
                    System.out.println("Aralik " + yil + " " + gun4+" Gundur.");


            }
        } else {
            switch (ayNumarasi) {
                case 1:
                    System.out.println("Ocak " + yil + " " + gun4+" Gundur.");
                    break;
                case 2:
                    System.out.println("Subat " + yil + " " + gun1+" Gundur.");
                    break;
                case 3:
                    System.out.println("Mart " + yil + " " + gun3+" Gundur.");
                    break;
                case 4:
                    System.out.println("Nisan " + yil + " " + gun3+" Gundur.");
                    break;
                case 5:
                    System.out.println("Mayis " + yil + " " + gun4+" Gundur.");
                    break;
                case 6:
                    System.out.println("Haziran " + yil + " " + gun3+" Gundur.");
                    break;
                case 7:
                    System.out.println("Temmuz " + yil + " " + gun4+" Gundur.");
                    break;
                case 8:
                    System.out.println("AGUSTOS " + yil + " " + gun4+" Gundur.");
                    break;
                case 9:
                    System.out.println("Eylul " + yil + " " + gun3+" Gundur.");
                    break;
                case 10:
                    System.out.println("Ekim " + yil + " " + gun4+" Gundur.");
                    break;
                case 11:
                    System.out.println("Kasım " + yil + " " + gun3+" Gundur.");
                    break;
                default:
                    System.out.println("Aralik " + yil + " " + gun4+" Gundur.");


            }


        }
    }
}