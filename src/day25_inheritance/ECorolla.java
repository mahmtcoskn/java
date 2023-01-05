package day25_inheritance;

public class ECorolla extends DToyota {
    ECorolla(){
        System.out.println("parametresiz corolla consructoru calıstı");
    }

    ECorolla(String param1){
        super("Gri");
        System.out.println("String parametreli corolla cons. calisti");
    }

    String model = "Corolla";
    String uretimYeri = "Turkiye";

    public static void main(String[] args) {

        ECorolla cor1 = new ECorolla("Mavi");


    }
    /*
        Bir obje olusturuldugunda ilk deger ataması yapılması için
        constructor calismalidir.

        Inheritanceda biliyoruz ki
        child classdan olusturulan her obje
        parent classdaki ozelliklere de sahip olur

        Parent classdaki ozelliklere sahip olabilmesi icin
        parent classdaki constructorlar da calismalidir.

        Java bu calismayı super() sayesinde saglar

        Javada her olusturulan classda default cons. oldugu gibi
        extends keyword kullanilan her classda olusturulan her cons.in
        ilk satirinda gorunmese de super() vardir
     */
}
