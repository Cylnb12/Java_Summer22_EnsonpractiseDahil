package day02_practice;

import java.util.Scanner;

public class Q08_KanBagisiYasAraligi {
    public static void main(String[] args) {
/*
		Problem tanimi :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */

        Scanner scan=new Scanner(System.in);

        int yas= scan.nextInt();
        int kilo;

        if (yas>18){ kilo= scan.nextInt();
            if (kilo>=50){
                System.out.println("Kan bagisi yapabilir");
            }else System.out.println("Kan bagisi yapamaz");
        }else System.out.println("Kan bagisi yapamaz");
    }
}
