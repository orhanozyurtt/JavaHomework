import java.util.Scanner;
public class minMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int ek=0, eb=0,deger=0;
        System.out.print("kaç tane sayı gireceksiniz : ");
        n = input.nextInt();
        for(int i = 1 ; i <= n ; i++){
            System.out.print(i + ". sayıyı girin : ");
            deger = input.nextInt();
            if(i == 1){
                eb = deger;
                ek = deger;
            } else if (deger > eb) {
                eb = deger;

            } else if (deger < ek) {
                ek = deger;
            }
        }
        System.out.println("en küçük sayı : "+ ek + "\n" +"en büyük sayı : "+ eb);
    }
}
