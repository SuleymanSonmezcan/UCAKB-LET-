package day03methodobjectcreationscanner;

public class Runner {
    public static void main(String[] args) {
        //obje nsaıl olusturulur

        //Constructor java da objeleri oluşturmak icim kullanilanozek bşr methode dir
        //New keyborde sigfirdan yeni bşr obje oluşturmak icin kullanilir
        //class ismi +object ismi + assigment operator+"new" keybord + constructor
        Car              myCar              =       new Car                ();

        System.out.println("myCar.fiyat = " + myCar.fiyat);

        System.out.println("myCar.model = " + myCar.model);

        myCar.hareket();
        myCar.dur();

        Student aliCan= new Student() ;


        System.out.println("aliCan.name = " + aliCan.name);
        System.out.println("aliCan.adres = " + aliCan.adres);
        System.out.println("aliCan.grade = " + aliCan.grade);
        aliCan.study();
        aliCan.feed();
        /*
        homework
        icinde isim ve yas variale lari ile teach bulunan bir Teacher objesı olusturun ve bu ozje uzerinde bu ozellikleri kullanin

         */


    }


}
