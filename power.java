import java.util.Scanner;

public class power {



     static int usAl(int taban,int us){
        int result=1;

        result = (taban*result);
        System.out.println("üs : "+us+" ");
        if(us == 1){
            return result;
        }
        return taban*usAl(result ,us-1);



    }
    public static void main(String[] args) {
        int taban=3 , us=3;
        /*Scanner input = new Scanner(System.in);
        taban = input.nextInt();
        us = input.nextInt();*/

        System.out.println(usAl(taban,us));

    }
}
