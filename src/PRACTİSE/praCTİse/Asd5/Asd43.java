package Asd5;

import java.util.Scanner;

public class Asd43 {
    public static void main(String[] args) {

 /*
      Kullanıcıdan alınan Stringin son karakteirini silep ekrana yazan Java kodunu yazınız.

Test Data:
good

Beklenen Çıktı:
goo
     */

        Scanner scan=new Scanner(System.in);

        String str=scan.nextLine();

        for (int i = 0; i < str.length()-1; i++) {
            System.out.print(str.charAt(i));
        }

    }
}
