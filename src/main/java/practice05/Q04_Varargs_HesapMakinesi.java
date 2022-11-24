package practice05;

public class Q04_Varargs_HesapMakinesi {

    // 4 Temel matematik işlemi  yapan bir kod yazsınız

    void top(int a, int b){
        System.out.println("Mes top "+(a+b));
    }


    public static void main(String[] args) {
        HesapMakinesi hesapMakinesi = new HesapMakinesi();
        hesapMakinesi.toplama(3,5,7,100);
        hesapMakinesi.çıkarma(10,10);
        hesapMakinesi.çarpma(12,12,10,0);
        hesapMakinesi.bolme(10,1.2);



    }



}
