package practice03;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Q04_DoWhile_TopunSicramasi {
    public static void main(String[] args) {
         /*
    Bir top belirli yükseklikten atılmaktadır.(Scanner ile yüksekliği al)
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.
    */

        Scanner input = new Scanner(System.in);
        System.out.println("İlk yüksekliği giriniz");
        double yukseklikk = input.nextDouble();


        int flag = 0;
        double topYol = yukseklikk;

        do {
            flag++;
            yukseklikk = yukseklikk * 3/4;

            topYol = topYol + (yukseklikk * 2);


        } while (yukseklikk > 1);
        System.out.println("Toplam Yol : " + (topYol - yukseklikk) + " Vurma sayısı : " + flag);

        //HOCANIN ÇÖZÜMÜ
        System.out.println("Birakilan yuksekligi gir");
        double yukseklik = input.nextDouble();
        double toplamYol = 0;
        int vurmaSayisi = 0;

        do {
            vurmaSayisi++;
            toplamYol += yukseklik;
            yukseklik = yukseklik*0.75;
            toplamYol += yukseklik;


        }while (yukseklik>1);

        System.out.println("Yere Vurma Sayisi = " + vurmaSayisi);
        System.out.println("Toplam Alinan Yol = " + toplamYol);

        NumberFormat numberFormat = new DecimalFormat(".#");
        System.out.println(numberFormat.format(toplamYol));
    }
}
