import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s1,s2,s3;
        System.out.println("sayı 1 : ");
        s1 = input.nextInt();
        System.out.println("sayı 2 : ");
        s2 = input.nextInt();
        System.out.println("sayı 3 : ");
        s3 = input.nextInt();

        if(s1<s2 && s1<s3){
            if(s2<s3){
                System.out.println(s1+"<"+s2+"<"+s3);
            }else {
                System.out.println(s1+"<"+s3+"<"+s2);
            }
        } else if (s2<s1 && s2<s3) {
            if (s1<s3){
                System.out.println(s2+"<"+s1+"<"+s3);
            }else {
                System.out.println(s2+"<"+s3+"<"+s1);
            }
        } else if (s3<s2 && s3<s1) {
            if(s1<s2){
                System.out.println(s3+"<"+s1+"<"+s2);
            }else{
                System.out.println(s3+"<"+s2+"<"+s1);
            }
        }

    }
}
