package day11;

public class Ternary02 {
    public static void main(String[] args) {

        //ornek1
        int a=10;
        int b=20;

        int r1 =a<b?a++:++b;
        System.out.println(r1);
        System.out.println(a);
        System.out.println(b);


        //Ornek2: Verilen bir sayinin mulak degerini hesaplayan kodu yaziniz
        //           -4 ==> -1*-4    4==Z4  0==>0


        int c=4;

        int r2= c< 0?-1*c:c;

        System.out.println(r2);


        //Ornek 3: Iki sayını ısagretı aynı ıse bu sayıları carpan ,isagretleri farkli ise "farkli isagretyleri carpamıyorum
        // "farkli isagretyleri carpamıyorum " mesajını versin


        int m=5;
        int n=6;


        Object r3= (m>0&&n>0) ||  (m<0 &&n<0)? m*n:"farkli isagretyleri carpamıyorum";

        System.out.println(r3);

        //"Objet"javada butun "Nun- Primitive daya type " (Class) lrinin oertak "Parent"(baba- anne)idir
        //"Object" in parenti yoktur
        //Farkli data type lar icinde ortek bir variable olusturmak ıstediginizde data type olarak object kullanabilirsiniz

        //java da "Objeck", insanlık ademinde "Hz Adem e benzer"


        //Ornek 4 . Size verilen sayinin 3 basamaklı olup olmadıgını konturol eden kodu yaziniz
        int p=313;
         String num= p>99&&p<1000?p+ "uc basamaklidir":p+ "ucbasamakli degildir";

        System.out.println(num);













































    }
}
