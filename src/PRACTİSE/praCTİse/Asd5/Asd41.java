package Asd5;

import java.util.Arrays;

public class Asd41 {
    public static void main(String[] args) {


         /* Merhaba arkadaşlar; aşağıdaki örnekte olduğu gibi
        1 den 10 a kadar sayılar oluşan dizide eksik olan sayıyı
         döndüren metodu oluşturunuz.
           Not: Çözümlerde tüm Class'ı paylaşırmısınız
   ([]) ➞ 4
   ([7, 2, 3, 10, 5, 9, 1, 4, 8]) ➞ 6
   ([7, 5, 1, 2, 4, 6, 8, 3, 9]) ➞ 10*/

        int[] orj={1,2,3,4,5,6,7,8,9,10};

        int[] sorulacak={1,2,3,5,6,7,8};

        for (int i = 0; i < orj.length; i++) {
            for (int j = 0; j < sorulacak.length; j++) {
                if (orj[i]== sorulacak[j]) {
                    orj[i] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(orj));
        System.out.println("=== dizi icinde bulenmayan sayilar ===");
        for (int i = 0; i < orj.length; i++) {
             if (orj[i]!=0) System.out.print(orj[i]+"  ");
        }


    }

    }
