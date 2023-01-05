package day25_inheritance;

public class APersonel {

    protected String isim = "Isim atanmadi";
    protected String soyisim = "Soyisim atanmadi";
    protected String telefon = "Telefon atanmadi";

    protected void maas(){
        System.out.println("Hastanemizde uygulanan asgari ücret 1100 eurodur");
    }

    protected void ozelSigorta(){
        System.out.println("Tum personelin ozel saglik sigortasi yapilir");

    }

    private void privateMethod(){
        System.out.println("private method calisti");
    }

}
