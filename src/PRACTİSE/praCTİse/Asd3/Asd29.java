package Asd3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Asd29 {
    public static void main(String[] args) {

        //1 ile 12 arasında girilen sayıdan ve yıldan yılın hangi ayı olduğunun
        // ve o yıl bu ayın kaç gün olduğunu hesaplayan Java kodunu yazınız.
        //
        //Test Data:
        //2
        //2016
        //
        //Beklenen çıktı:
        //2016 yili Subat ayi 29 gun
        //Test Data:
        //4
        //1998
        //Beklenen Çıktı:
        //
        //Copied!
        //1998 yili Nisan ayi 30 gun

        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        int year = input.nextInt();

        switch (month){
            case 1: System.out.println(year+" Ocak ayi 31 gundur"); break;
            case 2: if (year%4==0&&year%100!=0) System.out.println(year+" Subat ayi 29 gundur");
                    else if (year%400==0) {System.out.println(year+" Subat ayi 29 gundur");}else System.out.println(year+" Subat ayi 28 gundur");break;
            case 3: System.out.println(year+" Mart ayi 31 gundur"); break;
            case 4: System.out.println(year+" Nisan ayi 30 gundur"); break;
            case 5: System.out.println(year+" Mayis ayi 31 gundur"); break;
            case 6: System.out.println(year+" Haziran ayi 30 gundur"); break;
            case 7: System.out.println(year+" Temmuz ayi 31 gundur"); break;
            case 8: System.out.println(year+" Agustos ayi 31 gundur"); break;
            case 9: System.out.println(year+" Eylul ayi 30 gundur"); break;
            case 10: System.out.println(year+" Ekim ayi 31 gundur"); break;
            case 11: System.out.println(year+" Kasim ayi 30 gundur"); break;
            case 12: System.out.println(year+" Aralik ayi 31 gundur"); break;
        }


    }
}
