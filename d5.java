import java.util.Scanner;
public class d5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        System.out.println("sayı giriniz");
        number = scan.nextInt();
        System.out.println("girilen değere kadar olan 4 sayısının kuvetleri");
        for (int i = 1 ; i <=number;i*=4){
            System.out.println(i);

        }
        System.out.println("girilen değere kadar olan 5 sayısının kuvetleri");
        for (int i = 1 ; i <=number;i*=5){
            System.out.println(i);
        }
    }
}
