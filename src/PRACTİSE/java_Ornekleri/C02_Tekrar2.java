package PRACTİSE.java_Ornekleri;

import java.util.Scanner;

public class C02_Tekrar2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("boyunuzu girin:");
        double boy=scan.nextDouble()/100;
        System.out.print("kilo:");
        double kilo=scan.nextDouble();

        double bMı=kilo/(boy*boy);
        if(bMı<=20){
            System.out.println("Oldukca zayıfsınız!!");
        } else if (bMı<=25) {
            System.out.println("Normal sınırdasınız");
        } else if (bMı <= 30) {
            System.out.println("Sisman kategoridesiniz");
        }else {
            System.out.println("Obez grubundansınız");
        }


    }

}
