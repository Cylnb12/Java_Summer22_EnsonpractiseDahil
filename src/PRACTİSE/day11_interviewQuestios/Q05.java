package day11_interviewQuestios;

public class Q05 {
    public static void main(String[] args) {
//normal toplama method u varargs ile toplama methodu yaziniz
        int[] arr = {17, 23, 33, 9, 20};
        System.out.println("arrTopla(arr) = " + arrTopla(arr));
        varargsTopla(25, 55, 63, 21, 20);
        System.out.println("varargsToplaArr(arr) = " + varargsToplaArr(arr));
// varargs array gibi davrandigi icin herhengi bir array i parametre olarak verebiliyoruz

    }

    private static int varargsToplaArr(int... i) {

        int toplam = 0;
        for (int w : i) {
            toplam += w;

        }
        return toplam;


    }

    private static void varargsTopla(int i, int i1, int i2, int i3, int i4) {


    }

    private static int arrTopla(int[] arr) {
        int toplam = 0;
        for (int w : arr) {
            toplam += w;
        }

        return toplam;
    }
}
