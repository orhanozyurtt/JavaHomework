import java.util.Scanner;
public class d3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numb,total=0;

        do {
            System.out.print("enter a number : ");
            numb = scan.nextInt();
            if(numb % 4 == 0){
                total += numb;
            }

        }while (numb % 2==0);
        System.out.println(total);

    }
}
