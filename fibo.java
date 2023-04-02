import java.util.Scanner;
public class fibo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first=0,second = 1,n;

        System.out.println("deger : ");
        n = input.nextInt();
        for(int i = 1 ; i <= n ; i++){
            System.out.println(first +",");
            int next = first + second;
            first = second;
            second = next;

        }


        }



    }

