package day13_interviewQuestions;

public class Q03 {

    public static void main(String[] args) {


        String input="ey edip adanada pide ye";
        String temp=input;
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
        System.out.println();

        if (input.equals(""+str)){
            System.out.println(str+" palindromdur");
        }else System.out.println(str +" palindrom degildir");

    }
}
