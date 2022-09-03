package Asd4;

import java.util.Scanner;

public class Asd35 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("kac satirlik paskal ucgeni istiyorsunuz");
        int satirSayisi = scan.nextInt();
        int number;

        for (int i = 0; i < satirSayisi; i++) {
            for (int j = satirSayisi; j > i; j--)
                System.out.print(" ");
            number = 1;
            for (int k = 0; k <= i; k++) {
                System.out.print(number + " ");
                number = number * (i - k) / (k + 1);
            }
            System.out.println();
        }
    }
}
