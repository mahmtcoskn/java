package day28_exceptions;

public class C07_ExceptionTurleri {

    public static void main(String[] args) {

        String str = "234";

        // str a sayisa olarak 5 ekleyin ve yazdirin

        System.out.println(Integer.parseInt(str)+5);

        // Eger str icinde sayi olmayan bir karakter olursa NumberFormatException

        Object sayiObj = str;

        Integer sayiInt = (Integer)sayiObj;

        System.out.println(sayiInt);  // ClassCastException


    }
}
