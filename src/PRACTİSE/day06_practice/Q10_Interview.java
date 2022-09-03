package day06_practice;

import java.util.Scanner;

public class Q10_Interview {
    public static void main(String[] args) {
        /*
         * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
         * return eden metod yaziniz
         *
         * ornek:  input            output
         *         elma  2           eaea
         *         army  3           ayayay
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kelimeyi girin ardindan enter a basip\n" +
                "bas ve son harflarini kac kere yazdirmak istediginizi yaziniz");
        String input1= scan.next();
        int input2= scan.nextInt();


        String donut=firstLastLetterX2(input1,input2);



    }

    private static String firstLastLetterX2(String input1, int input2) {
        String[] arr=input1.split("");
        String donut="";
        for (int i = 0; i < input2; i++) {
            donut=arr[0]+arr[arr.length-1];
            System.out.print(arr[0]+arr[arr.length-1]);
        }
        return donut;
    }
}
