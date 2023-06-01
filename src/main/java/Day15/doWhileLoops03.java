package Day15;

import java.util.Scanner;

public class doWhileLoops03 {
    public static void main(String[] args) {
 /*
        Gecerli Username="admin" ve Password="pwd123" dur.
        Kullanicidan username ve password'u alin.
        Username ve password dogru ise console'a  yazdirin.
        Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin
        Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz
 */

        Scanner input=new Scanner(System.in);


        int counter=4;

        do {

            if (counter==0){
                System.out.println("Hesabiniz bloke olmustur");
                break;
            } else if (counter<4) {
                System.out.println(counter+"hakkınız kaldı");

            }

            System.out.println("Username i giriniz");
            String userName=input.next();

            System.out.println("Password u giriniz");
            String password=input.next();

            if (userName.equals("admin")&&password.equals("pwd123")){

                System.out.println("Hesabiniza hosgeldiniz!");
                break;
            }

            counter--;
        } while (true);
















    }
}
