package day18multidimensionalarray;

public class Md02 {
    public static void main(String[] args) {



        String students[][]={{"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyan"},{"Ceyhan","Kayhan"}};

        //Ornek yukari daki student arrayınde ıcınde m olan isimleri concole a ayazdiriniz


        for (String[] w :students) {


            for (String k:w){

                if (k.contains("m")){
                    System.out.println(k);
                }

            }
        }



        //Ornek 2: Bir int multidimensionnal arry olusturunuz ,tum elemanlariş carmını yazdiribniz



        int numbers [][]={{4,5},{2,3},{32,32}};

        int rusult=1;
        for (int[] w:numbers) {

            for (int k:w) {

               rusult*=k;

            }
        }
        System.out.println(rusult);





    }
}
