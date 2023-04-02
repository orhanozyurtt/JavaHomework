import java.util.Scanner;

public class ebobEkok {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sayi1 , sayi2,enbuyuk,enkucuk;

        int ebob = 1 , ekok = 1 ;



        System.out.print("1. sayıyı girin : ");
        sayi1 = input.nextInt();
        System.out.println();
        System.out.print("2. sayıyı girin : ");
        sayi2 = input.nextInt();

        if(sayi1 < sayi2){
            enbuyuk = sayi2;
            enkucuk = sayi1;
        }else{
            enbuyuk = sayi1;
            enkucuk = sayi2;
        }
        int i = 1 ;
        while (i <= enkucuk){
            if(sayi1 % i == 0 && sayi2 % i == 0){
                //System.out.println(i);
                ebob = i ;
            }
            i++;

        }
        ekok = (sayi1*sayi2) / ebob;
        System.out.println("ebob : "+ ebob);
        System.out.println("ekok : " + ekok);








    }

}
