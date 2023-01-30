import java.util.Scanner;
public class d11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float n,result=0;
        System.out.print("n değerini girin : ");
        n = input.nextInt();
        for(int i = 1 ; i <= n;i++){
            result += (1.0/i);


        }
        System.out.println(result);
    }
}
