package practice04;

public class Q06_Static_Butce_Runner {
    public static void main(String[] args) {

        Butce baba = new Butce();

        System.out.println("Maaaş Öncesi"+Butce.butce); // Maaaş Öncesi

        baba.maasAl(5000);
        System.out.println(Butce.butce); // 5000
        System.out.println(baba.harclik); // 0
        baba.harclikAl(500);
        System.out.println(Butce.butce); //4500
        System.out.println(baba.harclik); //500

        baba.harclikHarca(266);
        System.out.println(baba.harclik); //234

        baba.butcedenHarca(1000);
        System.out.println(Butce.butce); //3500

        Butce anne = new Butce();
        anne.maasAl(2000);
        anne.maasAl(3000);
        anne.harclikAl(2000);
        anne.harclikHarca(300);

        System.out.println("Butçe : "+Butce.butce);
        System.out.println("Harçlık : "+anne.harclik);


    }
}
