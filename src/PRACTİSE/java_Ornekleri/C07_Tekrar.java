package PRACTİSE.java_Ornekleri;

import java.util.Scanner;

public class C07_Tekrar {
    public static void main(String[] args) {
        //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi String manipulation method kullanarak birlestiriniz.
//yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen iki ayri deger girin :");
        String str1=scan.nextLine();
        System.out.println("ikinci kelimeyi");
        String str2=scan.nextLine();

        System.out.println("1.yontem :"+str1+" "+str2);
        System.out.println("2. yontem :"+str1.concat(" "+str2));

        String str1al=str1.substring(1)+str2.substring(1);
        System.out.println(str1al);




    }
}
