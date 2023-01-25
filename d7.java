import java.util.Scanner;

public class d7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //C(n,r) = n! / (r! * (n-r)!)
        int n,r,fakN=1,fakR=1,fak=1;
        System.out.print("kümenin eleman sayısını girin: ");
        n = input.nextInt();
        System.out.println("grupların eleman sayısını girin : ");
        r = input.nextInt();
        for(int i = n;i>=1;i--){
            fakN *= i;
        }
        for(int j = r;j>=1;j--){
            fakR *= j;
        }
        for(int k = (n-r);k>=1;k--){
            fak *= k;
        }
        int sonuc=0;
        sonuc=(fakN/(fakR*fak));
        System.out.println("sonuç : "+sonuc);

    }
}
