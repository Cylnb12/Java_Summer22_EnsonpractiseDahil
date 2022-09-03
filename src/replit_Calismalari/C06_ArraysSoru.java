package replit_Calismalari;

public class C06_ArraysSoru {
    public static void main(String[] args) {
        //soru9verilen bir arrayde masksimum sayiyibulan method olustur

        int[] array={3,45,46,89,2,-5,6,9,98,-23};

         maksimumSayi(array);




    }
    public static void maksimumSayi(int[] array) {

        int maksimunsayi=array[0];
        for (int i = 1; i < array.length ; i++) {
            if(maksimunsayi<array[i]){
                maksimunsayi=array[i];

            }

        } System.out.printf("arrayin maksimum elemani: "+maksimunsayi);




    }
}
