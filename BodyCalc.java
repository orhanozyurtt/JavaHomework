import java.util.Scanner;
public class BodyCalc {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        float boy=0,calc=0;
        int kilo=0;
        System.out.println("boyunuz : ");
        boy = inp.nextFloat();
        System.out.println("kilonuz");
        kilo = inp.nextInt();
        calc = (kilo/(boy*boy));
        System.out.println("Kitle indeksiniz : "+calc);
    }
}
