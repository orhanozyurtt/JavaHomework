import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class Exam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mat,fiz,tr,muz,kim,ort=0,top=0;

        /*
        * matematik fizik türkçe kimya müzik
        * geçme notu : 55
        * */

        System.out.println("Matematik dersinin notunu giriniz : ");
        mat = input.nextDouble();
        System.out.println("Fizik dersinin notunu giriniz : ");
        fiz = input.nextDouble();
        System.out.println("Türkçe dersinin notunu giriniz : ");
        tr = input.nextDouble();
        System.out.println("Müzik dersinin notunu giriniz : ");
        muz = input.nextDouble();
        System.out.println("Kimya dersinin notunu giriniz : ");
        kim = input.nextDouble();
        if((mat>=0 && mat<=100)) top += mat;
        if((fiz>=0 && fiz<=100)) top += fiz;
        if((tr>=0 && tr<=100)) top += tr;
        if((muz>=0 && muz<=100)) top += muz;
        if((kim>=0 && kim<=100)) top += kim;

        ort = top/5;
        if(ort >= 55){

            System.out.println("sınıfı geçtiniz");

            System.out.println("ortalamanız : "+ort);

        }else {
            System.out.println("geçme notunun altında bir not aldınız.Sınıf tekrarı ");
            System.out.println("ortlamanız : "+ort);
        }

    }
}
