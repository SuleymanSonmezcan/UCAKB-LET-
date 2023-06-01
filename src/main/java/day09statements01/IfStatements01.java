package day09statements01;

public class IfStatements01 {
    public static void main(String[] args) {

        //ornerk: Sayi uc basamaki ise ekrana "Sayi uc basamaklidir !" yazdiriniz


        int number=123;
        if (number>99 && number<1000){

            System.out.println("Sayi uc basamaklidir !");
        }



        //Ornek2: Bir Strıng teki tekrarsız karakterleri ekran ayazdiriniz

        //aabbccdc==>ad


        String str="aac";

        char ch1=  str.charAt(0);

        if (str.indexOf(ch1)==str.lastIndexOf(ch1)){

            System.out.println(ch1);
        }



        char chr2= str.charAt(1);

        if (str.indexOf(chr2) == str.lastIndexOf(chr2)){

            System.out.println(chr2);
        }



        char ch3 =str.charAt(2);
        if (str.indexOf(ch3)==str.lastIndexOf(ch3)){

            System.out.println(ch3);
        }





    }
}
