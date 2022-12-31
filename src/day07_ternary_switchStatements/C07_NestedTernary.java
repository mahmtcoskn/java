package day07_ternary_switchStatements;

public class C07_NestedTernary {
    public static void main(String[] args) {

        // tamsayi al
        // pozitifse cift sayi ya da degil yazdir
        // negatifse 3 basamakli ya da degil yazdirin

        int sayi = 25;
        System.out.println(sayi>0
                            ?
                            sayi%2==0 ? "cift sayi" : "tek sayi"
                            :
                            -100>=sayi && sayi>=-999 ? "3 basamakli" : "3 basamakli degil"
                            );
    }
}
