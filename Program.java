import java.util.Scanner;
public class Program {
    public static void main(String[] args) {

        float s1,s2;
        int secim;
        Scanner sc = new Scanner(System.in);

        System.out.println("Sayı 1'i girin");
        s1 = sc.nextInt();
        System.out.println("Sayı 2'yi girin");
        s2 = sc.nextInt();
        System.out.println("işlem seçin\n 1.toplama\n2.çarpma\n3.bölme\n4.çıkarma");
        secim = sc.nextInt();
      switch (secim){
          case 1:
              System.out.println("sonuç : "+(s1+s2));break;
          case 2:
              System.out.println("sonuç : "+(s1*s2));break;
          case 3:
              if (s2 != 0) {
                  System.out.println("sonuç : " + (s1 / s2));
              }else {
                  System.out.println("herhangi bir Sayı sıfıra bölünemez");
              }
              break;
          case 4:
              System.out.println("sonuç : "+(s1-s2) );;
          default:
              System.out.println("Geçersiz işlem");
      }

    }
}
