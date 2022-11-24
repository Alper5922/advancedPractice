package Practice06;

import java.util.Scanner;

public class Q02_RastgeleSifreOlusturma {
    public static void main(String[] args) {

//Kullanıcıdan aldığınız sayi kadar karakter uzunluğuna sahip rastgele şifre üreten bir kod yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("şifre uzunluğunu belrlemek için sayı giriniz");
        int sayi = input.nextInt();
        String sifre ="";


        String karakterler = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int maxIndex= karakterler.length();

        for (int i =0 ; i<=sayi ; i++){
            int rastgeleIndeks = (int)(Math.random()*maxIndex);
            sifre += karakterler.charAt(rastgeleIndeks);
        }

        System.out.println(sifre);


    }
}
