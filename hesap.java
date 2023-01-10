
import javax.imageio.ImageTranscoder;
import java.util.Scanner;
public class hesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* int k1,k2;
        System.out.println("1. kenar :");
        k1 = input.nextInt();
        System.out.println("2. kenar : ");
        k2 = input.nextInt();

        double hipo = Math.sqrt((k1*k1)+(k2*k2));
        System.out.println(hipo);
        */
         int k1,k2,k3;
        System.out.println("1. kenarı girin");
         k1 = input.nextInt();
        System.out.println("2. kenarı girin");
         k2 = input.nextInt();
        System.out.println("3. kenarı girin");
         k3 = input.nextInt();
         double cevre,alan,s;
         cevre = k1+k2+k3;
         s = cevre/2;
         alan = Math.sqrt(s * (s-k1)*(s-k2)*(s-k3));
        System.out.println("cevre : "+ cevre);
        System.out.println("alan : "+alan);

    }
}
