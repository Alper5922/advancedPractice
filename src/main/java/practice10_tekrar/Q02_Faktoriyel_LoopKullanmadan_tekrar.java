package practice10_tekrar;

public class Q02_Faktoriyel_LoopKullanmadan_tekrar {
    //Faktoriyel hesaplayan bir method yazınız.(Loop kullanmayınız.)
    public static void main(String[] args) throws Exception {

        System.out.println(faktoryel(5));

    }
    public static int faktoryel(int a) throws Exception{
        int result;
        if (a>0){
            if(a==1){
                return 1;
            }else {
                result = a * faktoryel(a-1);
            }

        }else throw new Exception(" Sayı 0'dan büyük olmalı");

        return result;
    }




}
