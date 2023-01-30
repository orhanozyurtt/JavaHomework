import java.util.Scanner;
public class d10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number,count=0,tempnumb;
        System.out.print("sayı girin : ");
        number = input.nextInt();
        tempnumb = number;
        while (tempnumb != 0){
            tempnumb /= 10;
            count++;
        }
        tempnumb = number;
        int result=0;
        for (int i = 1 ; i<=count;i++){
               result += (tempnumb % 10);
               tempnumb /= 10;

        }
        System.out.println(result);
    }

}
