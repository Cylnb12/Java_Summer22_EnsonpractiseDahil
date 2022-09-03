package day06_practice;

public class Q07_Arrays {
    public static void main(String[] args) {
        /*
         * verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini //
         * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1}; int
         * istenenToplam=9;
         */

        int [] arr = {5,7,-6,4,2,15,3,8,1};

        int wanted=9;

        arrMethod(arr,wanted);


    }

    private static void arrMethod(int[] arr, int wanted) {

        System.out.println("===  toplamlari "+wanted+" sayisina esit olan sayi ciftleri  ===");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j]==wanted){
                    System.out.print("("+arr[i]+" - "+arr[j]+")"+"    ");
                }
            }
        }
    }
}
