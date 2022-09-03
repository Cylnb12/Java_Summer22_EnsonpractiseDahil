package day08_practice;

public class Q02_ForEachHoca {
    public static void main(String[] args) {
        String[] list = {"fruits", "meat", "milk", "vegetables"};

        for (String element:list
             ) {
            System.out.print(element+" : "+element.length()+" ");

        }
        System.out.println();
        for (String item:list
             ) {
            if (item.startsWith("v"))break;
            System.out.print(item+", " );
        }

    }
}
