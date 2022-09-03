package Asd2;

import java.util.Scanner;

public class Asd16_TambolenleriVeSayisi {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int sayac=0;
        int bolenIcin=1;

        System.out.println("Lutfen Tam Bolenini Ogrenmek Istediginiz  Sayiyi Giriniz");

        int sayi= scan.nextInt();

        System.out.println(sayi+" Sayisini Tam Bolen Sayilar ");
        while (bolenIcin<=sayi){
            if (sayi%bolenIcin==0){
                System.out.print(bolenIcin+" ");
                sayac++;

            }
            bolenIcin++;

        }
        System.out.println("");
        System.out.println(sayi+" sayisinnin "+ sayac+" adet tam boleni vardir");

    }
}
