package practice09_tekrar;

public class Q01_VarArgs_NotOrtalamasi_tekrar {
    // 4 öğrencinin not ortalamasını sırasıyla 6, 4, 3 ve 5 sınav olacak şekilde hesaplayan bir method yazınız
    public static void main(String[] args) {
notOrtalaması("Erdem",96,92,52,63,101);
    }

    public static void notOrtalaması(String isim, double... not) {
        double sum = 0;
        int count = 0;
        for (double w : not) {
            if(w<101){
                sum += w;
                count++;
            }

        }
        System.out.println(isim+"'in not ortalaması : "+(sum/count));
    }
}
