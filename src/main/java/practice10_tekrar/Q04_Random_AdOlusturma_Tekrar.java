package practice10_tekrar;

public class Q04_Random_AdOlusturma_Tekrar {
    //Rastgele alınan harfleri bir Stringe ekleyerek adınızı oluşturan ve bunu kaç deneme ile yaptığını yazdıran bir kod yazınız.

    public static void main(String[] args) {
        String alfabe = "ABCDEFGHIJKLMNOPQRSTUVWXYZ^+%&/abcdefghijklmnopqrstuvwxyz";
        String isim1 = "ERDEM";
        String yenisim = "";
        int idx = alfabe.length();
        int count = 0;
        for (int i = 0; i < isim1.length(); i++) {
            while (true) {
                char rastkarakter = alfabe.charAt((int) (Math.random() * idx));
                count++;
                if (isim1.charAt(i) == rastkarakter ) {
                    yenisim += rastkarakter;


                    break;
                }

            }System.out.println(yenisim);

        }
        System.out.println(yenisim);
        System.out.println("Deneme sayısı : "+count);

    }
}
