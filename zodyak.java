import java.util.Scanner;
public class zodyak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year,zod;
        String metin = "Çin Zodyağı Burcunuz : ";
        System.out.print("Doğum Yılınızı Giriniz : ");
        year = input.nextInt();
        zod = (year%12);
        switch (zod){

            case 0 :
                System.out.println(metin+"Maymun");
                break;
            case 1 :
                System.out.println(metin+"Horoz");
                break;
            case 2 :
                System.out.println(metin+"Köpek");
                break;
            case 3 :
                System.out.println(metin+"Domuz");
                break;
            case 4 :
                System.out.println(metin+"Fare");
                break;
            case 5 :
                System.out.println(metin+"Öküz");
                break;
            case 6 :
                System.out.println(metin+"Kaplan");
                break;
            case 7 :
                System.out.println(metin+"Tavşan");
                break;
            case 8 :
                System.out.println(metin+"Ejderha");
                break;
            case 9 :
                System.out.println(metin+"Yılan");
                break;
            case 10 :
                System.out.println(metin+"At");
                break;
            case 11 :
                System.out.println(metin+"Koyun");
                break;
        }
    }

}
