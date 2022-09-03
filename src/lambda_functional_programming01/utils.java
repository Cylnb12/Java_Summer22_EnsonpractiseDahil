package lambda_functional_programming01;

public class utils {
    public static void ayniSatirdaBosluklaYazdir(Object obj) {
        System.out.print(obj + " ");
    }

    public static boolean CiftleriAl(Integer x) {
        return x % 2 == 0;
    }

    public static boolean tekElemanSec(Integer x) {
        return x % 2 != 0;
    }

    public static int kareal(Integer x) {
        return x * x;
    }

    public static int kupunuAl(Integer x) {
        return x * x * x;
    }

    public static double yariyaBol(double x) {
        return x / 2.0;
    }

    public static char sonKarakteriAl(String str) {
        return str.charAt(str.length() - 1);
    }

    public static char ilkKarakteriAl(String str) {
        return str.charAt(0);
    }

    public static int rakamlarToplamiAl(int x) {
        int temp = x;
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;
        while (x > 0) {
            birlerBasamagi = temp % 10;
            rakamlarToplami += birlerBasamagi;
            temp /= 10;
        }
        return rakamlarToplami;
    }
}
