package practise_session2;

import java.util.Scanner;

public class Q04_StringManipulation {
    public static void main(String[] args) {
        /*
Kullanicidan bir kelime girmesini isteyin.
* Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
* kelimenin ortasindaki karakteri yazdirin.
*/
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        String str= scan.next();
        System.out.println(str.length()%2!=0&&str.length()>=3?
                str.substring(str.length()/2,str.length()/2+1):"");
    }
}
