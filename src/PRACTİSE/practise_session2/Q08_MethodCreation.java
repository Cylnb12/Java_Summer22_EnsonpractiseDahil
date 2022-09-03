package practise_session2;

import java.util.Scanner;

public class Q08_MethodCreation {
    public static void main(String[] args) {
        /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */

         dortIslem(150,'+',25);

    }

    public static void dortIslem(int input1,char input2,int input3) {


        int sonuc=0;
        if (input2=='+') {
             sonuc=input1+input3;
            System.out.println("islem sonucu : "+sonuc);

        } else if (input2=='*') {
             sonuc=input1*input3;
            System.out.println("islem sonucu : "+sonuc);

        } else if (input2=='/') {
            sonuc=input1 / input3;
            System.out.println("islem sonucu : "+sonuc);
        } else if (input2=='-') {
            sonuc=(input1 - input3);
            System.out.println("islem sonucu : "+sonuc);

        }


    }

}
