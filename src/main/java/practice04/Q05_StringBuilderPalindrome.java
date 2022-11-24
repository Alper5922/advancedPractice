package practice04;

public class Q05_StringBuilderPalindrome {
    public static void main(String[] args) {

        //Bir String değeri palendrom olup olmadığını kontrol eden kod yazınız.

        String a = "ey edip adanada pide ye";
        String ters = "";
        for (int i =a.length()-1 ; i>=0 ; i-- ){
            ters += a.substring(i,i+1);
        }
        System.out.println(ters);
        if (ters.equals(a)){
            System.out.println("Polindromdur");
        } else {
            System.out.println("Polindrom değildir");
        }

        //2.YOL
        String str = "nazan1";
        StringBuilder stb = new StringBuilder(str);
        String stbReverse = stb.reverse().toString();

        if (str.equals(stbReverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Palindrome degil");
        }
    }
}
