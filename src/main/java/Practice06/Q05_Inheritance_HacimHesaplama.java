package Practice06;

public class Q05_Inheritance_HacimHesaplama {
    //Kare prizma, silindir ve koninin hacmini hesaplayan bir kod yazınız.(Inheritance kullanınız)

    public static void main(String[] args) {
        KarePrizma karePrizma = new KarePrizma();
        double karePrizmaHacmi = karePrizma.hacimHesapla(5, 6);
        System.out.println("kare Prizma Hacmi : " + karePrizmaHacmi);

        Koni koni = new Koni();
        double koniHacmi = koni.hacimHesapla(3, 5);
        System.out.println("koni Hacmi : " + koniHacmi);

        Silindir silindir = new Silindir();
        double silindirHacmi = silindir.hacimHesapla(1, 5);
        System.out.println("silindir Hacmi : " + silindirHacmi);
    }
}
