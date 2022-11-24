package practice09_tekrar.Q04_MaasHesapla_Interface;

import practice09.Q04_MaasHesapla_Interface.MaasArtir;

public class MaasHesaplama implements MaaşArtır,Vergi {
    @Override
    public double vergiHesaplama(double brutMaas, int calismaYili) {
        double vergi;
        if (calismaYili >10){
            vergi = brutMaas *0.3;
        }else {
            vergi= brutMaas *0.2;
        }
        return vergi;

    }

    @Override
    public int yillikArtirma(int calismaYili) {


        return calismaYili *100;
    }

    @Override
    public int saatlikArtirma(int aylikCalismaSaati) {


        return (aylikCalismaSaati -160)*10;


    }
    public  double netMaaş(double brutMaas,int aylikCalismaSaati,int calismaYili){
       return  brutMaas+yillikArtirma(calismaYili)+saatlikArtirma(aylikCalismaSaati)-vergiHesaplama(brutMaas,calismaYili);
    }
}
