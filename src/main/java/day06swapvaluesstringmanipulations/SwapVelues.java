package day06swapvaluesstringmanipulations;

public class SwapVelues {

    public static void main(String[] args) {
        //Swap : Yerdegistırmek
        // 1. kap patatates  2. kap domates==> 1.kap domates : 2. kap : patates

        int a=12;
        int b=5;//Swap tan sonra a= 5 , b=12
        int temp=0;

        System.out.println(a);

        System.out.println(b);

        //1.Adim


        temp=a;

        //2,adim

        a=b;
        //3. adım

        b =temp;
        System.out.println("a="+a);
        System.out.println("b="+b);


        //2. Yol


        int elma =12;
        int armut=5;


        System.out.println("elma = " + elma);
        System.out.println("armut = " + armut);

        elma=elma+armut;

          armut=elma-armut;

         elma=elma-armut;

        System.out.println("elma = " + elma);
        System.out.println("armut = " + armut);


    }
}
