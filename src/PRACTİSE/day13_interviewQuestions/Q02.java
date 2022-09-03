package day13_interviewQuestions;

public class Q02 {
      /*
         // Stringi ters cevirmek icin bir Java Programi yazin
         //1.Yol: StringBuilder () kullanarak
         //2.Yol: String Classini kullanarak
         //3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
  */

    public static void main(String[] args) {
        //1.Yol: StringBuilder () kullanarak
        String input="All is well";
        System.out.println("input = " + input);

        StringBuilder str=new StringBuilder();
        str.append(input);// append metgodu ekleme yapar
        String tersInput=""+str.reverse();
        System.out.println("tersInput = " + tersInput);
        System.out.println(str.reverse().reverse());

        System.out.println("2.yol");

        for (int i =input.length()-1; i>=0 ; i--) {
            System.out.print(input.charAt(i));// her bir karakteri alip yazdirdik yanyana

        }


    }
}
