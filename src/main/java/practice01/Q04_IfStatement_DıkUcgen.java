package practice01;

import java.util.Scanner;

public class Q04_IfStatement_DıkUcgen {
    public static void main(String[] args) {
        /*
        Kullanıcıdan üç adet sayı alarak bu sayıların
        bir dik üçgenin kenar uzunlukları olup olmadığını hesaplayan bir kod yazınız.
        (Yardım: Bir üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor
        bağlantısından yararlanabilirsiniz)
        Örnek Ekran Çıktısı:
        birinci kenarı giriniz: 3
        ikinci kenarı giriniz 4
        üçüncü kenarı giriniz: 5
        Bu bir dik üçgendir
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        Bu bir dik üçgen değildir.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("1.Kenar uzunluğunu giriniz");
        int a = input.nextInt();
        System.out.println("2.Kenar uzunluğunu giriniz");
        int b = input.nextInt();
        System.out.println("3.Kenar uzunluğunu giriniz");
        int c = input.nextInt();

        if ((a*a + b*b == c*c) || (a*a + c*c == b*b) || (b*b + c*c == a*a)){
            System.out.println("bu bir dik üçgendir");
        }else {
            System.out.println("Değildir");
        }
    }
}
