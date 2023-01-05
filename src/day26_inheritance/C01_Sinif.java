package day26_inheritance;

class Okul{

    String okulIsmi = "Yildiz Koleji";
    String telefon = "543";

}


public class C01_Sinif extends Okul {
    String sinif = "11-C";
    String telefon = "434";

    C01_Sinif(String telefon){

        System.out.println(telefon);  // scope dan başlar
        System.out.println(this.telefon);  // class level dan başlar
        System.out.println(super.telefon);  // parent dan başlar

        System.out.println(okulIsmi);  // scope dan başlar
        System.out.println(this.okulIsmi);  // class level dan başlar
        System.out.println(super.okulIsmi);  // parent dan başlar

        System.out.println(sinif);  // scope dan başlar
        System.out.println(this.sinif);  // class level dan başlar
        // System.out.println(super.sinif);  // parent dan başlar
        // Java da parent da bulamadigini gidip child a sorayim OLMAZ
        // parent class da aranan sinif degeri olmadigindan CTE verir


    }

    public static void main(String[] args) {

        C01_Sinif obj = new C01_Sinif("323");
    }
}
