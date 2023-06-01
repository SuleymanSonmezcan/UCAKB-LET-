package Day15;

public class WhileLoop01 {
    public static void main(String[] args) {


        //Kalıp olusturma
      /*
          for (caslangıcdegeri;loopkulari;arttırma/azaltma)

       */



       /*
       while loop kalıbı
       while(loop calısma mantıgı){
       calısıcak kodlar
       arttırma /azalma

       }
        */


        //1. yol for loop

        for (int i = 3; i <7 ; i++) {
            System.out.print(i+" ");

        }


        //2. yol while loop

        int i = 3;

         while(i<7){
             System.out.println(i+" ");
             i++;
         }




       //  ornek2:23den 12 ye kadar olan cıft sayıları console a yazdırınız


        int k=23;

        while (k>11){

            if (k%2==0){
                System.out.println(k);
            }


            k--;
        }




        //Ornek3 5 dan 19 a kadar tumtek sayıları consola yaazdırınız


        int m=6;

        while (m<20){

            if (m%2!=0){
                System.out.println(m+" ");
            }


            m++;
        }












    }
}
