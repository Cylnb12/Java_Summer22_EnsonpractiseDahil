package day07_practice;

public class Q02_MDArray {

    /*
     *  String 2D array olustur
     *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
     *  String de $ varsa 3.2 ile carp
     *  String de € varsa 4.2 ile carp
     *  elemanlarin toplamini double olarak yazdir
     */
    public static void main(String[] args) {
        String[][] arr={{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};
        double sum=0;
        double dolar=0;
        double euro=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].contains("$")){
                    String a=arr[i][j].replace("$","");

                    Double sayi=Double.parseDouble(a);

                    dolar+=3.2*sayi;



                } else if (arr[i][j].contains("€")){
                    String b=arr[i][j].replace("€","");
                    Double sayi=Double.parseDouble(b);

                   euro+=4.2*sayi;



                }

            }

        }
        sum=dolar+euro;
        System.out.println(dolar+"$ ve"+euro+"€ toplam = "+sum+"TL'dir");
    }
}
