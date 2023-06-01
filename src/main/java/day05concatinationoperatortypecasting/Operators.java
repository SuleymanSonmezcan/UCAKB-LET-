package day05concatinationoperatortypecasting;

public class Operators {


    /*
    1) +,-,/,* islemleri javada mamematikte kullanıldıgı gıbı kullanilir


    note1) int/int==> int olur


    Note2)double +int ==> double olur.

    Cunku: javada matematıksel ıslemlerde farklı data type ları kullanılırsa sonuc her zaman buyuk  data type ında olur

    2)Javada "Locical operator"lar vardir . ND ve OR islemleri "LogicaL Operator"lardir

    i)And (&&) isleminden true alabılmel ıcın her sey true olmalidir
      And İSLEMİ"PERFECTİONist" tir
      And isleminde bir tane bile fals sonucu fale yapar


      ii (||)sleminde sonucun fals olmasi icin her sey fals olmalidir
      or islemi "polyanna"dir.

      iii)NOT operator (!) true olanı false ,false olani true yapar
      !true  =>false
      !fasle =>true
      !!true => true


      3) Comparison (Karsılastırma) operators

          <,>,<=,>=,==,!=

          Note:karsilastırma operatorlerini kullandiniz KESİNLİKLE  boolean(true veya false) alirsiniz

        NOTE = biz (and) islemi icin && kullaniriz & kuillanimida vardir.
     Farklari nedir?
     "&&" kullanimda ilk ifade false oldugunda digerlerini kontrol etmez dolayisiyla
     hizli calisir. cunku && isleminde ilk ifade false ise digerlerinin bir onemi yoktur sonuc falsedur.
     "&" kullaniminda ilk ifade ne olursa olsun digerlerini kontrol eder dolayisi ile yavas calisir.
     Bis bu yuzden hep cift and && kullaniriz.





     */


    public static void main(String[] args) {




        boolean first= 3<5;


        boolean second= 2+3!=5;


        boolean third= 2+3*5>=19;

        System.out.println(first+"-"+second+"-"+third);
        System.out.println(first&&second);
        System.out.println(first || second || third);





    }







}
