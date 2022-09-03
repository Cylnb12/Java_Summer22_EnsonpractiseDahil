package PRACTİSE.java_Ornekleri;

import java.util.Scanner;

public class C13_Tekrar {
    public static void main(String[] args) {
/*
Kullanicidan bir kelime girmesini isteyin.
* Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
* kelimenin ortasindaki karakteri yazdirin.
*/
        Scanner scan=new Scanner(System.in);
        System.out.println("bir kelime girin :");
        String str=scan.nextLine();
        char ortnc=str.charAt((str.length()-1)/2);
        if(str.length()%2==1&&str.length()>=3){
            System.out.println(ortnc);

        }




    }
}
