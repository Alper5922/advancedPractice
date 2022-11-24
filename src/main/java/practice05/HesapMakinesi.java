package practice05;

public class HesapMakinesi {

    public void toplama(int... a) {
        int sum = 0;
        for (int w : a) {
            sum += w;
        }
        System.out.println("Toplam = " + sum);
    }

    public void çıkarma(int a, int b) {
        System.out.println("Çıkarma = " + (a - b));
    }

    public void çarpma(int... a) {
        int carpım = 1;
        for (int w : a) {
            carpım *= w;
        }
        System.out.println("Çarpım = " + carpım);
    }

    public void bolme(double a, double b) {
        if (b == 0) {
            System.out.println("Bolen sayi 0 olamaz");
        } else {
            System.out.println("Bolum = " + a / b);
        }

    }



}
