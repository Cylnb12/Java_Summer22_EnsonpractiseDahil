package Asd4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Asd34_UglySayi {
    public static void main(String[] args) {
        //Ugly Number:
        //
        //Girilen bir sayının ugly number olup olmadığını kontrol etmek için bir Java programı yazın.
        //
        //Sayı sisteminde, ugly number sadece asal faktörleri 2, 3 veya 5 olan pozitif sayılardır.
        // İlk 10 ugly number 1, 2, 3, 4, 5, 6, 8, 9, 10, 12'dir. Kural olarak, 1 dahil.
        //
        //Test Data:
        //13
        //Beklenen çıktı:
        //ugly number  degildir
        //Test Data:
        //25
        //Beklenen Çıktı:
        //ugly number

        Scanner sc=new Scanner(System.in);
        int numb=sc.nextInt();

        List<Integer> arr=new ArrayList<>();
        for (int i = 1; i <= numb/2; i++) {
            if (numb%i==0&&i%2!=0&&i%3!=0&&i%5!=0&&i!=1){
                arr.add(i);
            }
        }
        System.out.println(arr);

        if (arr.isEmpty()){
            System.out.println("ugly sayi");
        }else System.out.println("ugly sayi degil");






    }
}
