package day09_toUppercaseLocale;

public class C08_lastIndexOf {
    public static void main(String[] args) {

        String str = "Javayi iyi ogrenmek icin cok calismam lazim cok.";

        // ilk a'nin index'ini yazdiralim
        System.out.println(str.indexOf("a"));  // 1

        // son a'nin index'ini yazdirin
        System.out.println(str.lastIndexOf("a"));  // 39

        str.lastIndexOf(str.indexOf("a"));


        // verilen str'da cok kelimesinin kullanimini kontrol edip
        // - cok kelimesi kullanilmamis
        // - bir kere kullanilmis
        // - birden fazla kullanilmis
        // sonuclarindan uygun olani yazdirin
        // Javayi iyi ogrenmek icin cok calismam lazim cok.

        int ilkCokIndexi = str.indexOf("cok");
        int sonCokIndexi = str.lastIndexOf("cok");

        if (!str.contains("cok")){
            System.out.println("cok kullanilmamis");
        }else if (ilkCokIndexi==sonCokIndexi){
            System.out.println("cok bir kere kullanilmis");
        }else {
            System.out.println("cok birden fazla kullanılmış");
        }

    }
}
