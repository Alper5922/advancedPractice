package practice10_tekrar;

import java.io.*;
import java.util.Arrays;

public class Q03_TextOkuma {
    //Bir text dosyasındaki 3. satırının kelime sayısını veren bir kod yazınız.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Acer\\IdeaProjects\\advancedPractice\\src\\main\\java\\practice10\\HelloWorld.txt"));
        br.readLine();
        br.readLine();
        String s3 = br.readLine();
        System.out.println("3.satır : "+s3);
        String arr[]=s3.split(" ");
        System.out.println(Arrays.toString(arr));
        int kelimeSayisi = arr.length;
        System.out.println(kelimeSayisi);
        //Son satırı okutma...
        String s1 = null;
        while(br.readLine()!=null){
             s1 = br.readLine();

        }
       // String s1 = br.readLine();
        System.out.println(s1);
    }
}
