package Asd3;

import java.util.Arrays;

public class Asd22 {


public static void main(String[] args) {
  //Soru 2- Verilen String bir array’de en uzun ve en kisa String’leri yazdiran bir method olusturun


    String[] isimler={"Erdal","Onur","Mehmet","Hayrullah","Mihrican1"};

    String theMostLong=isimler[0];
    String shortest=isimler[0];
    for (int i = 0; i < isimler.length; i++) {
        if (isimler[i].length()<theMostLong.length()){
            theMostLong=isimler[i];

        }
        if (isimler[i].length()>shortest.length()){
            shortest=isimler[i];
        }
    }
    System.out.println("En kisa isim : "+shortest);
    System.out.println("En uzun isim : "+theMostLong);
    }
}
