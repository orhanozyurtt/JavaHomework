import java.util.Scanner;
public class ucgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("deger girin : ");
        int n ;
        n = input.nextInt();
        for(int i = n ; i >= 0 ; i--){
            for(int k = (n-i) ; k >= 1; k--){
                System.out.print(" ");
            }
            for(int j = (2*i)-1 ; j >=1 ; j--){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
