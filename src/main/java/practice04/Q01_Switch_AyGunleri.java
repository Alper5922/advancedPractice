package practice04;

import java.util.Scanner;

public class Q01_Switch_AyGunleri {
    public static void main(String[] args) {
        /*

Girilen yil ve ay numarasına göre ayin kaç gün olduğunu yazdiran bir kod yazınız.
    Girdi yıl: 2000 ay: 2
    Çıktı: 29

*/
        Scanner input = new Scanner(System.in);
        System.out.println("Yılı giriniz");
        int yıl = input.nextInt();

        System.out.println("Ay numarasını giriniz");
        int ay = input.nextInt();

        int gün;

        switch (ay){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Girdiğiniz ayın gün sayısı : 31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Girdiğiniz ayın gün sayısı : 30");
                break;
            case 2:
                if ((yıl%4==0 && yıl%100!=0) || yıl%400==0){
                    System.out.println("Girdiğiniz ayın gün sayısı : 29");
                }else {
                    System.out.println("Girdiğiniz ayın gün sayısı : 28");
                }
                break;
            default:
                System.out.println("Geçerli bir ay numarası giriniz");


        }





    }
}
