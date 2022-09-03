package PRACTİSE.day02_practice;

public class Q10_NestedTernary {
    public static void main(String[] args) {
/*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz

     */

        char input='b';

        System.out.println(input=='A'|| input=='a'?"Gayet Basarili":
                input=='B'||input=='b'? "Basarili": input=='C'|| input=='c'?"Ha gayret":"Digerleri");
    }
}
