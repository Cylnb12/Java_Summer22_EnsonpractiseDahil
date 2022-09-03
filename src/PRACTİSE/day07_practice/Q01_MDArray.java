package day07_practice;

public class Q01_MDArray {


    /*
     * {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini  olustur
     *  2D arrayinden min number print et
     */

    public static void main(String[] args) {


        int [][] d2arr={{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}};
        int mukayeseSayisi=d2arr[0][0];
        String sonuc="";
        for (int i = 0; i < d2arr.length; i++) {
            for (int j = 0; j < d2arr[i].length; j++) {
                if (j<mukayeseSayisi){
                    sonuc=""+d2arr[i][j];
                }else sonuc=""+mukayeseSayisi;
            }
        }
        System.out.println("Min. Numb = "+sonuc);


    }



}
