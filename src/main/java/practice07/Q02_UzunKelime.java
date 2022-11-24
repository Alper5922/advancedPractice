package practice07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q02_UzunKelime {

    /*
          Kullanıcıdan alınan cümledeki en uzun kelimeyi(kelimeleri) return eden bir method oluşturunuz.
         */
    public static void main(String[] args) {


        System.out.println(enUzunKelime());


    }
    public static List<String> enUzunKelime(){
        Scanner input = new Scanner(System.in);
        System.out.println("Cümle giriniz");
        String cumle = input.nextLine();
        String[] arr = cumle.split(" ");
        int max = 0;
        for (String w : arr){
            if (w.length()>max){
                max = w.length();
            }

        }
        List<String> enUzunKLelimeler = new ArrayList<>();
        for (String w: arr){
            if (w.length()==max){
                enUzunKLelimeler.add(w);
            }
        }


        return enUzunKLelimeler;
    }
}
