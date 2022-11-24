package practice05;

public class Q03 {

    //Küp, kare prizma ve dikdörtgen prizmanın hacmini hesaplayan bir method oluşturunuz.(Method overloading kullanınız)
    public static void main(String[] args) {

        Hacim hacim = new Hacim();
        hacim.küp(3);

        hacim.dikdörtgenPrizma(2,1,3);
        hacim.karePrizma(5,3);

        System.out.println(hacim.karePrizma(5,3));

    }
}
