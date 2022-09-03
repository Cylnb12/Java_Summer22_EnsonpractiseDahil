package Asd5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Asd45 {
    public static void main(String[] args) {

        ArrayList<String> ulkeler= new ArrayList<String>( List.of("Almanya", "Fransa", "Ingiltere", "Ispanya", "Italya") );

        ulkeler.add("Turkiye");
        System.out.println(ulkeler);

        ArrayList<Integer> sayı= new ArrayList<>(Arrays.asList(1,2,3,5,6,7,8,9,0)) ;
        int[] a={1,2,3,5,6,7,8,9,0};

        List<Integer> sayi1=new ArrayList<>(Arrays.asList(2342));
        System.out.println(sayi1);
        List<String> str1=new ArrayList<>(Arrays.asList("asdsad","fds"));
        System.out.println(str1);

        sayı.add(44);
        sayı.remove(1);

        System.out.println(sayı);


    }
}
