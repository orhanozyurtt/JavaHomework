import java.util.Scanner;
public class MukSayi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number,gTotal=0;
        System.out.print("bir sayı girin : ");
        number = input.nextInt();
        for(int i = 1 ; i <number ; i++ ){
            if(number % i == 0){
                gTotal += i;
            }
        }
        if(gTotal == number){
            System.out.println( number + " mükkeml sayı");

        }else {
            System.out.println(number  +" değil");
        }


    }


}
