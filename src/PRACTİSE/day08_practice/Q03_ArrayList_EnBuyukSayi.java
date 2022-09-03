package day08_practice;

import java.util.ArrayList;
import java.util.List;

public class Q03_ArrayList_EnBuyukSayi {

    /*
     * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
     * not kisa metodlar kullamayiniz
     * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 8};

        int tur = 3;

        List<Integer> list = new ArrayList<>();

        for (int j = 1; j < arr.length; j++) {

            list.add(arr[j]);

        }
        int mukys = list.get(0);


        for (int i = 1; i <= tur; i++) {

            mukys = 0;
            for (int k = 0; k < list.size(); k++) {
                if (mukys < list.get(k)) {

                    mukys = list.get(k);continue;
                }
            }
            System.out.println(i + ". en buyuk sayi = " + mukys);

            list.remove((Integer) mukys);


        }
        /*
            verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
        * not kisa metodlar kullamayiniz
        * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
        */



        }


    }

