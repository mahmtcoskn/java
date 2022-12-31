package day03_dataCasting_MatemetikselIslemler;

public class C05_WrapperClass {
    public static void main(String[] args) {
        int sayi=10;
        String str = "Java Candir";

        Integer sayi2=20;

        // String degerler arasinde int degerler de olabilir
        // bu durumda stringleri sayiya cevirmeye ihtiyac olabilir
        // harf veya sayi olmayan karakterler varsa java hata verir

        String str2="123";
        String str3="354";
        System.out.println(str2+str3);   // 123354

        int str2Int=Integer.parseInt(str2);   // 123
        int str3Int=Integer.parseInt(str3);   // 354

        System.out.println(str2Int+str3Int);   // 477

        System.out.println(Integer.MAX_VALUE);   // 2147483647
        System.out.println(Integer.MIN_VALUE);   // 2147483648

        char krk1='$';

        System.out.println(Character.isDigit(krk1));   // false
        System.out.println(Character.isLetter(krk1));   // false  harf degil
        System.out.println(Character.isAlphabetic(krk1));   // false  alfabetik degil

        short sayi3=4;
        int sayi4=sayi3;
        // wrapper classlarda casting olmaz

        short sayi6=45;
        //Integer sayi7=(Integer) sayi6;


    }
}
