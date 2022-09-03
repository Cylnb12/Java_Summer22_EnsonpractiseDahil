package Asd1;

import java.util.Scanner;

public class Asd9 {
    public static void main(String[] args) {
       // Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)
       // Input :
        //String str=“Javaisalsoeasy”
        //Output: a s

        String str = "Javaisalsoeasy";
        String karakter= "";
        String tekrarEden = "";
        for (int i = 0; i <= str.length() - 1; i++) {
            karakter = str.substring(i, i + 1);
            int ilkIndex = str.indexOf(karakter);// 0
            int sonIndex = str.lastIndexOf(karakter);
            if (ilkIndex != sonIndex) {
                if (!(tekrarEden.contains(karakter))) {
                    tekrarEden += " "+karakter;
                }
            }
        }
        System.out.println("tekrar Eden = " + tekrarEden);
    }
    }

