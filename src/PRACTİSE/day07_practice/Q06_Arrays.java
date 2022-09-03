package day07_practice;

import java.util.Arrays;

public class Q06_Arrays {

       /*

    kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.
 */
       public static void main(String[] args) {

              int[] arr={1,2,3,4,5,6,7,8,8,5,6,4,3};

              farkiniBul(arr);
       }

       private static void farkiniBul(int[] arr) {

              int ilk=arr[0];
              int min=0;
              int max=0;
              Arrays.sort(arr);
              for (int i = 0; i < arr.length; i++) {
                     if (i>ilk){
                            max=arr[i];
                     }
                     if (i<ilk){
                            min=arr[i];
                     }
              }
              System.out.println(max-min);

       }
}
