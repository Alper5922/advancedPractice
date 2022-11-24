package practice05;

import java.util.Scanner;

public class Q01_Ascii {
    public static void main(String[] args) {
        ////Kullanıcıdan aldığınız iki karakterin arasında bulunan tüm karakterleri yazdıran bir kod yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("İlk karakteri giriniz");
        char ch1 = input.next().charAt(0);
        System.out.println("İkinci karakteri giriniz");
        char ch2 = input.next().charAt(0);

        int ilk = Math.min(ch1,ch2);
        int ikinci = Math.max(ch2,ch1);

        for(int i = ilk ; i<=ikinci ; i++){

            System.out.print(" "+(char)i);

        }
        System.out.println();

        // 2.YOL
        System.out.println("iki karakter gir");
        char ch11 = input.next().charAt(0);
        char ch22 = input.next().charAt(0);
        char ilkk = ch1<ch2 ? ch1 : ch2;
        char son = ch1>ch2 ? ch1 : ch2;
        for(char i=++ilkk; i<son; i++){
            System.out.println(i);
        }
    }
}
