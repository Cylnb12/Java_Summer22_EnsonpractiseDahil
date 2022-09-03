package practise_session2;

import java.util.Scanner;

public class Q01_StringManipulaton {
    public static void main(String[] args) {
        /*
         * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
         *
         * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
         *
         */
        String a = "cesaret", b = "insana", c = "sinirlarini", d = "ogretir";


        System.out.println(a.substring(0, 1).toUpperCase() + a.substring(1) + " " + b + " " + c + " " + d + ".");


        Scanner scan=new Scanner(System.in);
        System.out.println("cumle olusturnmak icin 4 ayri kelime girin ve aralarinda enter a basin");
        String str1= scan.next();
        String str2= scan.next();
        String str3= scan.next();
        String str4= scan.next();
        System.out.println(str1.substring(0,1).toUpperCase()+str1.substring(1).toLowerCase()+" "+str2.toLowerCase()+
                " "+str3.toLowerCase()+" "+str4.toLowerCase()+".");
    }
}
