package practice03;

import java.net.CookieHandler;
import java.util.Arrays;
import java.util.Collections;

public class Q03_Arrays_IkinciMax {
    public static void main(String[] args) {

        /*
        Bir Array içerisindeki 'minimum', 'maksimum'  ve 'ikinci maksimum' değerleri bulan
        bir kod yazınız.

        input: int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};
        output: min:-90, max:10001, secMax: 8787

       */

        int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};
        Arrays.sort(arr); //[-90, 0, 1, 100, 845, 898, 8787, 10001]

        int min = arr[0];
        int max = arr[arr.length-1];
        int max2= arr[arr.length-2];
        System.out.println(min+" "+max+" "+max2);

    }
}
