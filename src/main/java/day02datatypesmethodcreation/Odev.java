package day02datatypesmethodcreation;

public class Odev {


    public static void main(String[] args) {

System.out.println(dikdortkenAlanHesaplama(40 , 30));


        System.out.println(dikdortkenCevreHesaplama(32,20));


    }

 public static long dikdortkenAlanHesaplama( int uzunkenar , int kisakenar   ){
        return uzunkenar * kisakenar;

 }

    private static long dikdortkenCevreHesaplama( int uzunKenar, int kisaKenar   ){
      return  2*(uzunKenar+kisaKenar);

    }
}
