package PRACTİSE.java_Ornekleri;

public class C03_Tkrar3 {
    public static void main(String[] args) {
        String gun = "PAZAR";
       gun.equalsIgnoreCase(gun);
        switch (gun) {
            case "pazartesi":
            case "salı":
                System.out.println("Java dersi gunleri");
                break;
            case "persembe":
            case "cuma":
                System.out.println("Selenyum dersleri");
                break;
            case "carsamba":
            case "cumartesi":
                System.out.println("SQl dersleri");
                break;
            default:
                System.out.println("iZİN GUNU");


        }


    }
}
















