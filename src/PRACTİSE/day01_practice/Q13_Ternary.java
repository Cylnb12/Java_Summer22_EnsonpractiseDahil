package PRACTİSE.day01_practice;

public class Q13_Ternary {
    public static void main(String[] args) {
        /*
         * Ternary kullanarak bir kod yazin. fiyat isminde bir variable tanimlayin. eger fiyat
         * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
         * olsun
         */

        int fiyat=11;
        System.out.println(fiyat>=20?"pahali":fiyat>10 ? "normal":"ucuz" );
    }
}
