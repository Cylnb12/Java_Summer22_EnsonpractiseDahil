package replitCalismalari;

import com.sun.jdi.CharType;
import com.sun.jdi.CharValue;

import java.util.Scanner;

public class C03_Deneme {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen başlangıç harfini giriniz: ");
         String bas= scan.nextLine();
         bas=bas.toUpperCase();
         char bas1=bas.charAt(0);
        System.out.println("lütfen bitiş harfini giriniz: ");
        String son =scan.nextLine();
        son=son.toUpperCase();
        char son1=son.charAt(0);

        while (bas1<=son1){


            if(bas1==son1){
                System.out.print(bas1);
                break;
            }else {
                System.out.print(bas1+" ,");
                bas1++;
            }




        }

    }
}

