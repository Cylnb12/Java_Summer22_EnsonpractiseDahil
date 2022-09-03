package day07_practice;

import java.util.Arrays;

public class Q04_Arrays {

    /*
     *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
     *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
     */
    public static void main(String[] args) {

        String str="Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
        String strbosluksuz=str.replaceAll("\\s","");
        String[] arr=strbosluksuz.split("");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);



        // altta alternatif fsrkli bir cozum...(bosluk sayisi kelime sayisinin bir eksigidir)
        String str1 = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
        String kelime[] =str1.split(" ");
        int boslukSayisi = kelime.length-1;
        System.out.println("boslukSayisi = " + boslukSayisi);
        String charcter [] = str1.split("");
        System.out.println("charcter sayisi  = " + (charcter.length-boslukSayisi));
    }
}
