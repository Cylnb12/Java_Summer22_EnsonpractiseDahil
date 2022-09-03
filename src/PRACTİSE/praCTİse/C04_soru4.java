package praCTİse;

import java.util.Scanner;

public class C04_soru4 {
    public static void main(String[] args) {
        /*
Kullanıcıdan bir kelime girmesini isteyin.
 Sözcüğün tek sayıda karakteri varsa ve 3 veya daha fazla karakteri varsa,
karakteri sözcüğün ortasına yazdırın.
kelime çift sayıda karakter baskısına sahip "Yanlış kelime girdiniz."
     INPUT      :   celik
     OUTPUT    :   l
     INPUT      :   elif
     OUTPUT    :   You entered wrong word.*/
        Scanner scan=new Scanner(System.in);

        String word="";
        do {
            System.out.println("lutfen bir kelime giriniz :");
            word=scan.nextLine();
            if(word.length()<3){
                System.out.println("girilen word 3 karakterden az");
            }if (word.length()%2==1 && word.length()>=3){
                System.out.println("ortadaki karakter "+word.charAt(word.length()/2));
            }else {
                System.out.println("yanlis kelime girdin");
            }



        }while (!(word.length()%2==1 && word.length()>=3));


    }
}
