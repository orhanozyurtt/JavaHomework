import java.util.Scanner;
public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName,password,sec;


        System.out.println("Kullanıcı adını girin : ");
        userName = input.nextLine();
        System.out.println("Şifrenizi girin : ");
        password = input.nextLine();

        if (userName.equals("patika")){

            if (password.equals("java123")){
                System.out.println("kullanıcı adı ve şifre doğru.Başarıyla giriş yaptınız");
            }else {
                System.out.println("Şifre hatalı!! \n sıfırlamak ister misiniz?(e/h) : ");
                sec = input.nextLine();
                if (sec.equalsIgnoreCase("e")){
                    System.out.println("Yeni şifre : ");
                    String nPassword = input.nextLine();
                    if(nPassword.equals(password) || nPassword.equals("java123")){
                        System.out.println("şifre olşturulamadı lütfen başka şifre giriniz");
                    }else {

                        System.out.println("şifre oluşturuldu");

                    }
                }else {
                    System.out.println("Şifre yenileme isteği  tarafınızca reddedildi ");
                }

            }
        }else {
            System.out.println("kullanıcı adı hatalı");
        }



    }
}
