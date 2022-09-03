package Asd4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Asd40 {
    public static void main(String[] args) {

        /* Merhaba arkadaşlar; aşağıdaki örnekte olduğu gibi
        1 den 10 a kadar sayılar oluşan dizide eksik olan sayıyı
         döndüren metodu oluşturunuz.
           Not: Çözümlerde tüm Class'ı paylaşırmısınız
   ([]) ➞ 4
   ([7, 2, 3, 10, 5, 9, 1, 4, 8]) ➞ 6
   ([7, 5, 1, 2, 4, 6, 8, 3, 9]) ➞ 10*/



        int []arr={7, 2, 3, 10, 5, 9, 1, 4, 8};

        int toplam=0;
        for (int i = 0; i < arr.length ; i++) {
            toplam+=arr[i];
        }

        if (100-toplam!=0){
            System.out.println("eksik sayi ="+(55-toplam));
        }else System.out.println("eksik sayi bulunmamaktadir ");
       // bu kodla sadece tek sayiya ulasilabilir



    }
}
