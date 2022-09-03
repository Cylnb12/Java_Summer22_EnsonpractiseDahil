package day07_practice;

public class Q03_MDArray {

    /*
     * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
     * yaziniz
     * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
     *
     * OUTPUT : Arraydeki cift sayilarin toplami : 30
     */
    public static void main(String[] args) {

        int[][] cif={{1,3,6},{2,8},{5,7,9,14}};
        int ciftSayilarToplami=0;
        for (int i = 0; i < cif.length ; i++) {
            for (int j = 0; j < cif[i].length; j++) {
                if (cif[i][j]%2==0){
                    ciftSayilarToplami+=cif[i][j];
                }
            }
        }
        System.out.println("ciftSayilarToplami = " + ciftSayilarToplami);
    }
}
