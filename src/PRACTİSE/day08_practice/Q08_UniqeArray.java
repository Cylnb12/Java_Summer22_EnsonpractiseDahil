package day08_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q08_UniqeArray {
    /*
     * Verilen array deki tekrar eden sayilari, ilki haric silip, tekrarsiz
     * sayilardan olusan bir array haline getiren bir program yaziniz.
     *
     * INPUT : {1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10}
     * OUTPUT : [1, 2, 3, 4, -2, 5, 6, 8, 7, 9, 10]
     */

    public static void main(String[] args) {

        String str="1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10";
        String[] sayilar={str};
        str=str.replace(","," ");
        sayilar=str.split(" ");

        String tekrarsiz="";
        for (int i = 0; i < sayilar.length ; i++) {
            if (!tekrarsiz.contains(sayilar[i])){
                tekrarsiz+=sayilar[i]+" ";
            }
        }
        sayilar=tekrarsiz.split(" ");
        System.out.println(Arrays.toString(sayilar));
//------------------------------ilk cozum buraya kadar --------------------------------------------------
        System.out.println();


            int arr[]={1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10};

            List<Integer> sayi=new ArrayList<>();
            for (int i = 0; i <arr.length; i++) {
                if ( !sayi.contains(arr[i])) {
                    sayi.add(arr[i]);
                }
            }

            System.out.println(sayi);

             arr=new int[sayi.size()];
        for (int i = 0; i < sayi.size(); i++) {
            arr[i]=sayi.get(i);
        }

        System.out.println(Arrays.toString(arr));



        }
}
