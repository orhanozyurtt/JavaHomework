import java.util.Scanner;

public class KasaCalc {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double total=0;
        double armut=2.14 , elma=3.67,domates=1.11,muz=0.95,patlican=5;
        double armutKg,elmaKg,domatesKg,muzKg,patlicanKg;
        System.out.println("Armut kaç kilo : ");
        armutKg = inp.nextDouble();
        System.out.println("Elma kaç kilo : ");
        elmaKg = inp.nextDouble();
        System.out.println("Domates kaç kilo : ");
        domatesKg = inp.nextDouble();
        System.out.println("Muz kaç kilo : ");
        muzKg = inp.nextDouble();
        System.out.println("Patlıcan kaç kilo : ");
        patlicanKg = inp.nextDouble();

        total = (armut*armutKg)+(elma*elmaKg)+(domates*domatesKg)+(muz*muzKg)+(patlicanKg*patlican);
        System.out.println("Toplam tutar"+total);




    }
}
