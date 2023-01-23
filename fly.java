import java.util.Scanner;
public class fly {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float mesafe,v1=0.10f,total=0,cTotal=0,ageD=0,biletD=0;
        int age,bilet;
        System.out.print("Mesafe bilgisini giriniz(KM) : ");
        mesafe = input.nextFloat();
        System.out.print("yaşınız  : ");
        age = input.nextInt();
        System.out.print("tek yön için = 1 \n gidiş-dönüş için = 2 girin :");
        bilet = input.nextInt();

        if(mesafe>0 && age > 0 && (bilet==1 || bilet ==2 )){
            //System.out.println("hesaplama yapılcak");
            total = mesafe*v1;
            if(age <=12){
                ageD = ((total*50)/100);

            } else if (age>12 && age <=24) {
                ageD = ((total*10)/100);

            } else if (age>65) {
                ageD = ((total*30)/100);

            }else {
                System.out.println("Yaş indirimi alamadınız");
            }
            if(bilet==2){
                total -= ageD;
                biletD = (total*20)/100;
                total = ((total - biletD) * 2) ;

            }

            System.out.print("Toplam bilet ücreti : ");
            System.out.printf("%.2f",total);



        }else {
            System.out.println("Hatalı veri girdiniz!");
        }



        System.out.println(cTotal);
    }
}
