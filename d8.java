import java.util.Scanner;
public class d8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kuvvet,number,sonuc=1;

        System.out.print("sayı gir : ");
        number  = scan.nextInt();
        System.out.print("kuvveti gir :");
        kuvvet = scan.nextInt();

        for (int i=1 ; i <=kuvvet;i++){
            sonuc*=number;
        }
        System.out.println(sonuc);



    }
}

