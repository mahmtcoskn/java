package day25_inheritance;

public class DToyota extends CCar{

    DToyota(){
        System.out.println("parametresiz toyota constructorı calisti");
    }

    DToyota(String param1){
        System.out.println("parametreli toyota cans calisti");
    }

    String marka = "Toyota";
    String uretimYeri = "Toyota farki ülkelerde üretilir ";

}
