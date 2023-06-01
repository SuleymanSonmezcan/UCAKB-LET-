package day16arraysdoreachloops;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {


        //ornek 1: Intiger bir array olusturunuz , icine 6 tagne eleman yerleştiriniz bu elemanlar
        //bu elemanlarin en kucugu ile ben buyugu topalmını yazdiriniz






        int ages[]=new int[6];

        ages[0]=20;
        ages[1]=23;
        ages[2]=19;
        ages[3]=44;
        ages[4]=15;
        ages[5]=32;

        System.out.println("Arrays.toString(ages) = " + Arrays.toString(ages));


        //1.yol
        //sort() methodu aray deki elemanlari kucukten buyuge dizer

        Arrays.sort(ages);

        System.out.println(Arrays.toString(ages));


        System.out.println(ages[0]+ages[ages.length-1]);

        //2.yol






        int minimum= ages[0];

        for (int w:ages) {
          minimum=  Math.min(minimum,w);
        }

        System.out.println(minimum);




        int maximum=ages[0];
        for (int w:ages){
            maximum=Math.max(maximum,w);



        }
        System.out.println(maximum);

        System.out.println(minimum+maximum);


        //Ornek 2:
        //String bir array olusturunuz

        String colors[]= new String[6];

        colors[0]="Red";
        colors[1]="Oramge";
        colors[2]="Blue";
        colors[3]="Yellow";
        colors[4]="Green";
        colors[5]="Brown";

        System.out.println(Arrays.toString(colors));


        for (String w:colors){
            if (w.equals("Yellow")){
                break;

            }
            System.out.println(w);

        }

    }

}
