import java.util.Scanner;
public class d1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi,total=0,sayac=0;

        sayi = input.nextInt();

        for(int i=0;i <= sayi;i++){
            if(i % 12 ==0){
                total += i;
                sayac++;
            }
        }
        System.out.println(total/sayac);



    }
}
