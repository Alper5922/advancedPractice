package practice09_tekrar.Q04_MaasHesapla_Interface;

public class Runner {
     /*
        Net maaş hesaplayan bir kod yazınız.(Interface kullanınız)
        Maaş kriterleri: Brüt maaş belirle.
                         Çalışanın toplam çalışma yılına göre her yıl için maaşı 100 dolar  artır.
                         Çalışanın aylık çalışma saatine göre 160 saat üstü  her saat için maaşı 10 dolar artır.
                         10 yıl ve üstü çalışma yılı bulunan çalışanların maaşlarından %30, diğerlerinden %20 vergi kesintisi yap.
         */

    public static void main(String[] args) {
        MaasHesaplama veli = new MaasHesaplama();
        System.out.println(veli.netMaaş(10000,170,20));
    }
}
