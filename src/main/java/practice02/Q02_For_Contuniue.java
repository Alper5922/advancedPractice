package practice02;

import java.util.Scanner;

public class Q02_For_Contuniue {
    public static void main(String[] args) {

        /* TASK :
        Kullanıcıdan 5 adet sayı isteyiniz
        Bu sayılardan 5 ile 10 arasındakiler hariç,
        diğerlerinin toplamını bulunuz.
        */
        Scanner input = new Scanner(System.in);

        //ÇALIŞMAYAN ÇÖZÜM

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Sayı giriniz");

            int a = input.nextInt();

            if (a < 5 && a > 10) {
                System.out.println("Girdiğiniz sayı 5 ile 10 arasında olduğundan işleme alınmayacaktır.");
            } else {

                sum = sum + a;
            }
        }
        System.out.println(sum);


        /*  ÇALIŞAN ÇÖZÜM
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Sayı giriniz");

            int a = input.nextInt();

            if (a > 5 && a < 10) {
                System.out.println("Girdiğiniz sayı 5 ile 10 arasında olduğundan işleme alınmayacaktır.");
            } else {

                sum = sum + a;
            }
        }
        System.out.println(sum);*/

        /*  HOCANIN ÇÖZÜMÜ
         Scanner input = new Scanner(System.in);
        int toplam = 0;
        for(int i=0; i<5;i++){
            System.out.println("Bir sayi giriniz");

            int sayi = input.nextInt();
            if(sayi>5 && sayi<10){
                System.out.println("Girdiginiz sayi 5 ile 10 arasinda oldugundan isleme alinmayacaktir.");
                continue;
            }
            toplam += sayi;// ==> toplam = toplam + sayi
        }
        System.out.println("Toplam = " + toplam);
         */

    }
}
