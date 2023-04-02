import java.util.Scanner;

public class banka {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3 ;
        int select;
        int balance = 1500,tutar=0;
        while (right > 0){

            System.out.println("Kullanıcı Adınız : ");
            userName = input.nextLine();
            System.out.println("Parolanız");
            password = input.nextLine();

            if(userName.equals("orhan") && password.equals("123")){
                System.out.println("Hoşgeldiniz sayın " + userName );
                do {
                    System.out.println("yapmak istediğiniz işlemi seçinz :\n " +
                            "1- Para çek \n" +
                            " 2 - Para yatır \n" +
                            " 3 - bakiye sorgula\n" +
                            "4 - çıkış yap"
                    );
                    select = input.nextInt();
                    switch (select){
                        case 1:
                            System.out.println("Çekilecek tutar : ");
                            tutar = input.nextInt();
                            if(tutar <= balance){
                                balance -= tutar;
                                System.out.println("Bakiyeniz : "+balance);
                                System.out.println("*****************************");
                            }
                            else {
                                System.out.println("çekmek istediğiniz tutar bakiyenizden fazla. Bakiyeniz : "+balance);
                                System.out.println("*****************************");

                            }
                            break;
                        case 2:
                            System.out.println("Tutar giriniz");
                            tutar = input.nextInt();
                            if(tutar>0){
                                balance += tutar;
                                System.out.println("para yatırma işlemi gerçekleşti. Bakiyeniz : "+balance);
                                System.out.println("*****************************");

                                break;
                            }
                            else {
                                System.out.println("hatalı tutar bilgisi");
                                System.out.println("*****************************");

                                break;
                            }
                        case 3:
                            System.out.println("Hesap Bakiyeniz : "+balance + "TL");
                            System.out.println("*****************************");
                            break;
                        case 4 :
                            System.out.println("Güle Güle ");
                            System.out.println("*****************************");

                    }



                }while (select != 4);


            }
            else {
                right--;
                System.out.println("giriş başarısız. kalan hakkınız : "+ right);
                if(right <= 0 ){
                    System.out.println("Haklarınız tükendi. Lütfen bankanızla iletişime geçiniz");
                }
            }
        }

    }
}
