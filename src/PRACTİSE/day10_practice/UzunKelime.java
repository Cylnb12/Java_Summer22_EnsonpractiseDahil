package day10_practice;

import java.util.Scanner;

public class UzunKelime {

    public static void main(String[] args) {

         /* ve cumledeki en uzun kelimeyi return eden LongestWord(sentence) methodu create ediniz.
                * Trick: Aynı uzunlukta iki veya daha fazla kelime varsa, String'deki en uzun ilk sözcüğü return edilsin
                * Noktalama işaretlerini dikkate almayın ve cumlenin boş olmayacağını varsayın.
 */


        Scanner scan=new Scanner(System.in);
        System.out.println("Bir cumle giriniz");

        String cumle= scan.nextLine();


        EnUzunKelime(cumle);
        System.out.println(EnUzunKelime(cumle));

    }

    public static String EnUzunKelime(String cumle) {

        String[] arr=cumle.split(" ");
        String maximum=arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (maximum.length()<arr[i].length()){
                maximum=arr[i];
            }

        }
        maximum="Girdiginiz cumle icinde =="+maximum.toUpperCase()+"== kelmesi en uzun kelimedir ve "+maximum.length()+" karakterdir";


        return maximum;

    }

}
