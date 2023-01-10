
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ücret Tutarını Giriniz");
        double para=0,kdv1=18,kdv2 = 8,kdvHesap=0,sonuc=0;
        para = input.nextFloat();

        kdvHesap = para < 1000 ? ((para*kdv2)/100) : ((para*kdv1)/100);
        System.out.println("ana para : "+para);
        System.out.println("toplam kdv tutarı : "+kdvHesap);
        sonuc = para + kdvHesap;
        System.out.println("kdv li tutar : "+sonuc);






    }
}
