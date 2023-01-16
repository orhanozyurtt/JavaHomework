import java.util.Scanner;
public class HavaDurumu {
    public static void main(String[] args) {
        int heat = 0 ;
        Scanner input = new Scanner(System.in);
        System.out.println("Hava kaç derece ? ");
        heat = input.nextInt();
        /*
        if(heat < 5){
            System.out.println("kayak yapmaya gidebilirsin");

        }else if(heat>=5 && heat<=15){

            System.out.println("sinemaya gidebilirsin");
        } else if (heat>=10 && heat<=25) {
            System.out.println("piknik yapmaya gidebilirsin");
        } else if (heat>=25) {
            System.out.println("denize gidebilirsin");
        }
        */
        System.out.println("şu etkinliği yapabilirsin");
         if(heat>=25){
             System.out.println("denize");
         } else if (heat>=5 && heat<=15) {
             //System.out.println("sinemaya");
             if(heat>=10) System.out.println("piknik\nsinema");
            else System.out.println("sinema");
         }else if (heat>=10 && heat<=25){
             //System.out.println("piknik");
             if(heat>=15) System.out.println("piknik\ndeniz");
             else System.out.println("piknik");
         } else if (heat<=5) {
             System.out.println("kayak");
         }
    }
}
