package Practice06;

public class Kitap {

    String kitapAdi;
    String yazarAdi;
    int sayfaSayisi;
    String seriNo;
    static int kitapSayisi;

    Kitap(String kitapAdi, String yazarAdi, int sayfaSayisi) {

        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.sayfaSayisi = sayfaSayisi;
        kitapSayisi++;
        seriNo = yazarAdi.substring(0, 2) + kitapAdi.substring(0, 2) + kitapSayisi;

    }

    public void kitapBilgileri(){
        System.out.println("  Kitap Adı : "+kitapAdi+ "\n  Yazar Adı : "+yazarAdi+"\n  Sayfa Sayısı : "+sayfaSayisi+"\n  Seri No : "+seriNo);
    }

}
