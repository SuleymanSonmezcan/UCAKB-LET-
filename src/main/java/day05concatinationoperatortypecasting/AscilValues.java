package day05concatinationoperatortypecasting;

public class AscilValues {

    public static void main(String[] args) {
        /*
        javada her karakterin sayisal bir degeri vardir bu degerler ASCIIdegerler olarak adlandirilir
        bu degerlerin tamainin bulundugu tabloya ACCII tablo denir


         */

        //herhangı bır ASCIIdegerini bulmak icin o karakteri "int" data typinda bir variable nin icine koyunuz

        char ch = 'a';

        System.out.println(ch);//a

        int k = 'a';
        System.out.println(k);


        int unlem='!';
        System.out.println(unlem);

        char c1='?';
        char c2=')';
        System.out.println(c1+c2);
        //Javada char ları matamatıksel  ıslemlerde kullanırsanız eger java o char ların ACII degerlerini kullanıır



    }
}