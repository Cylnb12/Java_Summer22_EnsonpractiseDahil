package PRACTİSE.java_Ornekleri;

import java.util.Scanner;

public class C10_Tekrar {
    public static void main(String[] args) {
        /*
         * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
         *
         * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
         *
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("kullanıcıdan dörtkelime girin:");
        String str1= scan.nextLine().toLowerCase();
        System.out.println("kullanıcıdan dörtkelime girin:");
        String    str2= scan.nextLine().toLowerCase();
        System.out.println("kullanıcıdan dörtkelime girin:");

        String   str3= scan.nextLine().toLowerCase();
        System.out.println("kullanıcıdan dörtkelime girin:");
        String   str4= scan.nextLine().toLowerCase();
        str1=str1.substring(0,1).toUpperCase()+str1.substring(1);
        String cumle=str1+" "+str2+" "+str3+" "+str4+".";
        System.out.println(cumle);






    }
}
