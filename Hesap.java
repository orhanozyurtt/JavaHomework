import java.util.Scanner;
public class Hesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Yarı çap uzunluğunu giriniz: ");
        double r,a,sonuc=0 ;
        final double pi = 3.14f;
        r = input.nextDouble();
        System.out.println("merkez açının ölüsünü girin : ");
        a = input.nextDouble();
        sonuc = (pi * (r*r)*a)/360;
        System.out.println("sonuç : "+sonuc);




        /*
        double r = input.nextDouble();
        final float pi = 3.14f;
        double alan,cevre;
        alan = pi * r * r;
        cevre = 2*pi*r;
        */



    }
}
