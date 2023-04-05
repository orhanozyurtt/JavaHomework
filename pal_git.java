import java.security.KeyStore;
import java.util.Scanner;
public class pal_git {
    static int basamak_bul(int number){
        int basamakcount = 0;
        while (number >= 1){
            number /= 10 ;
            basamakcount++;
        }
        return basamakcount;
    }
    static boolean isPalindrom(int number){

        int counter = basamak_bul(number);
        String numbStr = "";
        int numberTemp = number,reverseNumb = 0;
        if(number >=1){
            for (int i = 1 ; i <= counter;i++){
                int a;
                a = numberTemp % 10;
                numberTemp /= 10;
                numbStr += String.valueOf(a);
            }
            System.out.println("Sayının tersten okunuşu : " + numbStr);
            reverseNumb = Integer.parseInt(numbStr);
            if (reverseNumb == number){
                return true;
            }else {
                return false;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı girin : ");
        int number = input.nextInt();
        if (number == 0) {
            System.out.println("sıfırdan farklı bir değer girin");
        } else if (isPalindrom(number)) {
            System.out.println("Girilen sayı palindrom sayıdır");
        }else{
            System.out.println("Girilen sayı palindrom sayı değildir");
        }

    }

}
