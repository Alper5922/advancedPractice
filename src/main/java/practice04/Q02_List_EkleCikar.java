package practice04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q02_List_EkleCikar {
    public static void main(String[] args) {
         /*
Kullanıcdan aldığınız bir sayıyı bir list'e ekleyen,
list'ten çıkaran yada mevcut bir elementi o sayı ile güncelleyen bir kod yazınız.
 */

        Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        while (true) {
            System.out.println("Ekleme yapmak için 'add' \n" +
                    "Güncelleme yapmak için  'update' \n" +
                    "Silmek için 'delete' \n" +
                    "Çıkmak  için 'quit' kon-mutu giriniz");
            String option = input.next();

            if (option.equalsIgnoreCase("add")) {
                System.out.println("Eklemek istediğiniz sayıyı giriniz");
                int eklenecekSayı = input.nextInt();
                list.add(eklenecekSayı);
            } else if (option.equalsIgnoreCase("update")) {
                System.out.println("Güncellemek istediğiniz sayıyı giriniz");
                int guncellenecekSayı = input.nextInt();
                System.out.println("Girmek istediğiniz sayıyı giriniz");
                int yeniSayı = input.nextInt();
                list.set(list.indexOf(guncellenecekSayı), yeniSayı);
            } else if (option.equalsIgnoreCase("delete")) {
                System.out.println("Silmek istediğiniz sayıyı giriniz");
                int silinecekSayı = input.nextInt();
                list.remove(list.indexOf(silinecekSayı));
            } else if (option.equalsIgnoreCase("quit")) {
                break;
            } else {
                System.out.println("Geçerli bir komut giriniz");
            }
            System.out.println(list);
        }
        System.out.println(list);

    }
}
