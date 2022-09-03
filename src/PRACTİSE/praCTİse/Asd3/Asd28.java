package Asd3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Asd28 {
    public static void main(String[] args) {


         /*   parametre olarak alan  ve dizide 7 rakamı  var ise
           "Boom!" ifadesini; aksi takdirde  "dizide 7 rakamı yok" ifadesini döndüren bir method oluşturun".
        Örnek çıktı:
[1, 2, 3, 4, 5, 6, 7])➞ "Boom!"
                [8, 6, 33, 100] ➞ "dizide 7 rakamı yok"
                [2, 55, 60, 97, 86] ➞ "Boom!"*/
        int [] dizi={1, 2, 3, 4, 5, 6,75};
        String a=diziKontrolEt(dizi);
        System.out.println(diziKontrolEt(dizi));
    }
    private static String diziKontrolEt(int[] dizi) {
        int basamakkalan=0;
        int kontrol=0;
        for (int each:dizi) {
            if ( (each%10)==7){
                basamakkalan=each/10;
                kontrol++;
            }

        }
        String sonuc="";
        if (kontrol==0){
            sonuc="dizide 7 yok";
        }else sonuc="Boom";

        return sonuc;
    }
    }

