package practice09.Q03_AbstractionAlanHesaplama;

public class Runner {

    public static void main(String[] args) {
        Ucgen ucgen = new Ucgen();
        System.out.println(ucgen.alanHesapla(4, 2));

        Dikdortgen dikdortgen = new Dikdortgen();
        System.out.println(dikdortgen.alanHesapla(5,4));


    }
}
