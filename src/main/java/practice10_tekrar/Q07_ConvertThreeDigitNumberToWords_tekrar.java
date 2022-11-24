package practice10_tekrar;

public class Q07_ConvertThreeDigitNumberToWords_tekrar {
    //Uc haneli bir sayıyı ingilizce okunuşuna çeviren bir kod yazınız.
    public static void main(String[] args) {
        int number = 123;
        int ones = number % 10;
        int tens = (number / 10) % 10;
        int hundreds = number / 100;

        switch (hundreds) {
            case 1:
                System.out.print("yüz ");
                break;
            case 2:
                System.out.print("ikiyüz ");
                break;
            case 3:
                System.out.print("üçyüz ");
                break;
            case 4:
                System.out.print("dörtyüz ");
                break;
            case 5:
                System.out.print("beşyüz ");
                break;
            case 6:
                System.out.print("altıyüz ");
                break;
            case 7:
                System.out.print("yediyüz ");
                break;
            case 8:
                System.out.print("sekizyüz ");
                break;
            case 9:
                System.out.print("dokuzyüz ");
                break;

        }
        switch (tens) {
            case 1:
                System.out.print("on ");
                break;
            case 2:
                System.out.print("yirmi ");
                break;
            case 3:
                System.out.print("otuz ");
                break;
            case 4:
                System.out.print("kırk ");
                break;
            case 5:
                System.out.print("elli ");
                break;
            case 6:
                System.out.print("altmış ");
                break;
            case 7:
                System.out.print("yetmiş ");
                break;
            case 8:
                System.out.print("seksen ");
                break;
            case 9:
                System.out.print("doksan ");
                break;

        }
        switch (ones) {
            case 1:
                System.out.print("bir ");
                break;
            case 2:
                System.out.print("iki ");
                break;
            case 3:
                System.out.print("üç ");
                break;
            case 4:
                System.out.print("dört ");
                break;
            case 5:
                System.out.print("beş ");
                break;
            case 6:
                System.out.print("altı ");
                break;
            case 7:
                System.out.print("yedi ");
                break;
            case 8:
                System.out.print("sekiz ");
                break;
            case 9:
                System.out.print("dokuz ");
                break;

        }
    }

}
