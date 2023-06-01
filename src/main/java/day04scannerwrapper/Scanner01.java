package day04scannerwrapper;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        // orn1; Kullanicidan ve ilk ismni ve soy ismi alip ikisini ayni satirda ekrana yazdiriniz

        //1 adim Scanner class dan bır obje olustur

        Scanner input = new Scanner(System.in);

               // 2. adim:Kulanıcıya ne ıstedıgınızı dair mesaj verınız
        System.out.println("ilk ısmınızı giriniz");

        //3 adim :Uygun methodu kullanarak kullanıcının verdıgı datayıi memory e yerleştiriniz

        //next() methodu kullanıcıdan tek kelımelık strıg almak ıcın k0ullanılır
       String fırstName= input.next();

        System.out.println("Soy ısmınızı gırınız");
        String lastName = input.next();
        System.out.println(fırstName+" "+lastName);

    }
}
