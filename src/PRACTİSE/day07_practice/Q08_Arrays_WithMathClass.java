package day07_practice;

import java.util.Scanner;

public class Q08_Arrays_WithMathClass {
    public static void main(String[] args) {

           /*

    kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.
 */


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kac elemanli bir Array olusturmak istediginizi yaziniz :");
        int kacEleman=scan.nextInt();
        int []arr=new int[kacEleman];
        for (int i = 0; i < kacEleman; i++) {
            System.out.println("Lutfen "+(i+1)+". elemani giriniz");
            int eleman= scan.nextInt();
            arr[i]=eleman;

        }
        int kiyas=arr[0];
        int sonuc=0;
        for (int i = 1; i <kacEleman ; i++) {
            if (Math.max(arr[i],kiyas)==arr[i]) sonuc=arr[i];else sonuc=kiyas;
        }
        System.out.println("En buyuk sayi : "+sonuc);
    }
}
