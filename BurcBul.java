import java.util.Scanner;
import java.util.TreeMap;

public class BurcBul {
    public static void main(String[] args) {

        int day,month;
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum gününüzü girin : ");
        day = input.nextInt();
        System.out.print("doğum ayınızı girin(1-12 arasında olacak şekilde değer giriniz): ");
        month = input.nextInt();

        if((day >= 21 &&  day<=31 && month == 3)||(day<=20 && day>=1 &&  month==4) ){
            System.out.println("koç");

        } else if ((day>=21 && day<=31 &&  month==4) || (day<=21 && day>=1 && month==5)) {
            System.out.println("boğa");
        } else if ((day>=22 && day<=31 && month==5)||(day<=22 && day >=1 && month==6)) {
            System.out.println("ikizler");
        } else if ((day>=23 && day<=31 && month==6)||(day<=22 && day>=1 && month==7)) {
            System.out.println("yengeç");
        } else if ((day >=23 && day<=31 &&  month==7)||(day <= 22 && day>=1 && month == 8)) {
            System.out.println("aslan");
        } else if ((day >= 23 && day<=31 && month==8)||(day<=22 && day>=1 && month== 9)) {
            System.out.println("başak");
        } else if ((day >=23 && day<=31 && month== 9)||(day <= 22 && day>=1 && month==10)) {
            System.out.println("terazi");
        } else if ((day>=23 && day<=31 &&  month== 10)||(day<=21 && day>=1 && month==11)) {
            System.out.println("akrep");
        } else if ((day>=22 && day<=31 && month==11)||(day<=21 && day>=1 && month==12)) {
            System.out.println("yay");
        } else if ((day>=22 && day<=31 && month==12)||(day<=21 && day>=1 && month==1)) {
            System.out.println("oğlak");
        } else if ((day>=22 && day<=31 && month==1)||(day<=19 && day>=1 && month==2)) {
            System.out.println("kova");
        }else if ((day>=20 && day<=29 && month==2)||(day<=20 && day<=1 && month==3)){
            System.out.println("balık");
        }else {
            System.out.println("böyle bir ay veya gün yoktur");
        }


    }
}
