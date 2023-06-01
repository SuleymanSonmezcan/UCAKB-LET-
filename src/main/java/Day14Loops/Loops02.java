package Day14Loops;

public class Loops02 {
    public static void main(String[] args) {


        //Ornek 1: 5 den 8 me kadar tamssayıları toplamını veren kodu yazınız

        //5+6+7+8+9==>26


        int sum=0;

        for (int i=5;i<9;i++){

          sum=  sum+ i;


        }
        System.out.println(sum);

        //Ornek 2 : 7 den 9 a kar tamsayıları carpımını veren kodu yazınız

        int num=1;


        for (int i=7;i<10;i++){

           num=  num*i;
        }
        System.out.println(num);



        //Ornek 3: Verilen bir tamsayinin rakamlarinin toplamini veren kodu yaziniz
        // 578  ==> 5 + 7 + 8 = 20

        int toplam =0;

        int num3=-578;

        num3= Math.abs(num3);
              for (int i=num3 ;i>0;i=i/10){



            toplam = toplam + i%10;


              }

        System.out.println(toplam);














    }
}
