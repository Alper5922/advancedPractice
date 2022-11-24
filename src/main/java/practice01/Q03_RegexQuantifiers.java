package practice01;

public class Q03_RegexQuantifiers {
    public static void main(String[] args) {
        // 1.SORU-) Bir String değerin belirli sayıda karakter içerip belirli bir
        // karakter ile bitip bitmediğini kontrol eden bir kod yazınız.

        String str = "as";
        System.out.println(str.matches(".."));
        System.out.println(str.matches("."));
        System.out.println(str.matches("a."));
        System.out.println(str.matches("aa."));
        System.out.println();

        /*  2.SORU-)   Bir String değerin ikinci karakterinin belirli
        bir karakter olup olmadığını kontrol eden bir kod yazınız.*/

        String str2 ="MertDertGert";
        System.out.println("2) "+str2.matches(".e.*"));

        // 3.SORU-) Bir String değerin sadece
        // harf içerip içermediğini kontol eden bir kod yazınız.
        System.out.println("3) "+"ca".matches("[a-zA-Z]*"));


       // 4.SORU-) Bir String değerin belirli bir sayıda belirli karakterleri
        //içerdiğini kontrol eden bir kod yazınız.
        System.out.println("4) "+"abcdh".matches("[a-zA-Z]{5}"));// TRUe --> 5 karakterli ve hepsi harf
        System.out.println("4) "+"abcdhq".matches("[a-zA-Z]{5}")); //--> 5 ten fazla karakter içerdiği için False
        System.out.println("4) "+"abcd6".matches("[a-zA-Z]{5}")); //--->> Harf dışında karakter içerdiği için FAlse

       /*  5.SORU-) Bir String değerin belirli karakterleri en az belirli
       sayıda içerip içermediğini kontrol eden bir kod yazınız.
       */
        System.out.println("5.soru ) "+"1234567".matches("[0-9]{6,}")); // , virgül ile kullanılırsa--> en az 6 rakam içermeli anlamına gelir

    /* 6.SORU
   Bir String değerin belirli karakterleri en az ve en çok belirli sayıda içerip
   içermediğini kontrol eden bir kod yazınız.
    */
        System.out.println("6.soru) "+"abcd123aAc".matches("\\w{7,10}")); //w=[a-zA-Z0-9]--Bunlardan en az 7 en çok 10 karkater içermeli
        System.out.println("6.soru) "+"abcd123aAcoo".matches("\\w{7,10}"));

    /* 7.SORU) ilk karakter 1, ikinci karekter noktalama işareti ve kalan
       8 karakter rakam toplam 10 karakter olmali,*/
        System.out.println("7.soru) "+"1?12345678".matches("[1][\\p{Punct}][0-9]{8}"));
        System.out.println("7.soru) "+"1?12345*78".matches("[1][\\p{Punct}][0-9]{8}"));
        System.out.println("7.soru) "+"1?1234565691565678".matches("[1][\\p{Punct}][0-9]*"));
//                                                                        1.k      2.k   3.ve sonrası




    }
}
