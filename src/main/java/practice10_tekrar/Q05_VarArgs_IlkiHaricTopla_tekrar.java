package practice10_tekrar;

public class Q05_VarArgs_IlkiHaricTopla_tekrar {
    /*
      Parametrelerinin ilki hariç  karakter sayılarını toplayan ve bu toplamı birinci parametrenin karakter sayısıyla çarpan bir method yazınız.
      (indeks ve if statement kullanmayınız)
     */
    public static void main(String[] args) {
        deneme("ali","can","man","dan");
    }
    public static void deneme(String a, String... b){
        int sum =0;
        for (String w : b){
            sum+=w.length();

        }
        int result = a.length() * sum ;

        System.out.println(result);
    }
}
