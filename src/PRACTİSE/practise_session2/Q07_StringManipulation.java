package practise_session2;

import java.util.Scanner;

public class Q07_StringManipulation {
    public static void main(String[] args) {
        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("4 haneli bir yazi yaziniz");
        String input=scan.next();

        String tersten=input.substring(3)+
                input.substring(2,3)+
                input.substring(1,2)+
                input.substring(0,1);
        System.out.println("Yazdiginiz inputun tersten yazimi : "+tersten);
    }
}
