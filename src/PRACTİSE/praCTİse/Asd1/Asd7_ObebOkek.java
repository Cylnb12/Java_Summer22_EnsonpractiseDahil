package Asd1;

public class Asd7_ObebOkek {
    public static void main(String[] args) {

        int ebob=0;

        int sayi1=40;
        int sayi2=25;
        for (int i = 1; i <= sayi1; i++) {
            if (sayi1%i==0&&sayi2%i==0){
                ebob=i;

            }

        }
        System.out.println(sayi1+" ve "+sayi2+" icin GCD = "+ebob);

        int ekok=0;
        int max=sayi1*sayi2;

        for (int i = max; i > 0 ; i--) {
            if (i%sayi1==0&&i%sayi2==0){
                ekok=i;
            }

        }

        System.out.println(sayi1+" ve "+sayi2+" icin LMC = "+ekok);

    }
}
