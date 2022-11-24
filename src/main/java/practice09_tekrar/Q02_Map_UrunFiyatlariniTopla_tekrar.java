package practice09_tekrar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q02_Map_UrunFiyatlariniTopla_tekrar {
    /*
        Bir map içerisinde verilen fiyatların toplamını bulan bir kod yazınız.(for each loop kullanınız)
        Örn: {Kemer=19.99, Gömlek=29.99, Ayakkabı=89.99, Kazak=24.99, Kravat=19.99} ==> Toplam: 184.95
        */
    public static void main(String[] args) {
        HashMap<String, Double> urunFiyati = new HashMap<>();
        urunFiyati.put("Kemer", 19.99);
        urunFiyati.put("Gomlek", 29.99);
        urunFiyati.put("Ayakkabi", 89.99);
        urunFiyati.put("Kazak", 24.99);
        urunFiyati.put("Kravat", 19.99);
        System.out.println(urunFiyati);//{Kemer=19.99, Kazak=24.99, Kravat=19.99, Ayakkabi=89.99, Gomlek=29.99}

        List<Double> urunFiyatiList = new ArrayList<>(urunFiyati.values());
        double sum = 0;
        for (double w : urunFiyatiList) {
            sum += w;
        }
        System.out.println(sum);


    }


}
