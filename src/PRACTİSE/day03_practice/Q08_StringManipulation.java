package day03_practice;

import java.util.Scanner;

public class Q08_StringManipulation {
    public static void main(String[] args) {
        /*
         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el
         */


        Scanner scan=new Scanner(System.in);
        System.out.println("bir kelime giriver gari");
        String kelime=scan.next();

        if (kelime.length()>2){ kelime=kelime.substring(kelime.length()-2);
            System.out.println(kelime+kelime+kelime);
        }else System.out.println(kelime);
    }
}
