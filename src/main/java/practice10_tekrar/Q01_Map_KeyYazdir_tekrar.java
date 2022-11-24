package practice10_tekrar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Q01_Map_KeyYazdir_tekrar {

    public static void main(String[] args) {
        //Aşağıda verilen fiyat listesinden fiyatı 29.99 olan ürünlerin adlarını yazdırınız.

        Map<String, Double> urunler = new HashMap<>();
        urunler.put("Kemer", 19.99);
        urunler.put("Gomlek", 29.99);
        urunler.put("Kazak", 24.99);
        urunler.put("Pijama", 29.99);
        urunler.put("Ayakkabi", 89.99);
        urunler.put("Kravat", 19.99);
        urunler.put("Terlik", 29.99);
        System.out.println(urunler);


        ArrayList<Double> fiyatlar = new ArrayList<>(urunler.values());
        System.out.println(fiyatlar);
        ArrayList<String> isimler = new ArrayList<>(urunler.keySet());
        System.out.println(isimler);
        for (int i =0 ; i< isimler.size(); i++){
            if (fiyatlar.get(i)==29.99){
                System.out.println(isimler.get(i));
            }
        }
    }
}
