package practice04;

public class Butce {

    //Basit bir ev bütçesi kodu yazınız

    public static int butce;
    public int harclik;

    public void harclikAl(int alinanHarclik){
        harclik += alinanHarclik;
        butce -= alinanHarclik;
    }
    public void butcedenHarca(int harcanakPara){
        butce -= harcanakPara;
    }
    public void harclikHarca(int harclikHarcamasi){
        harclik -= harclikHarcamasi;
    }
    public void maasAl(int alinanMaas){
        butce +=alinanMaas;
    }

}
