package day07_ternary_switchStatements;

public class C08_SwitchStatements {
    public static void main(String[] args) {

        // kullanicidan 2 sayi alin
        // kullaniciya istedigi islemi sorun
        // +,-,*,/ isaretlerinden hangisini girerse
        // 2 sayi icin o islemi yapin
        // bunlardan birini girmezse yanlıs tercih yazdirin

        int sayi1=20;
        int sayi2=10;

        char islem='+';

        // if else if ile yapalim

        if (islem=='+'){
            System.out.println("Sayilarin toplami : " + (sayi1+sayi2));
        } else if (islem=='-') {
            System.out.println("Sayilarin farki : " + (sayi1-sayi2));
        } else if (islem=='*') {
            System.out.println("Sayilarin carpimi :" + sayi1*sayi2);
        } else if (islem=='/') {
            System.out.println("Sayilarin bolumu : " + sayi1/sayi2);
        }else {
            System.out.println("yanlis islem tercihi");
        }

        // switch ile yapalim

        switch (islem){
            case '+' :
                System.out.println("Sayilarin toplami : " + (sayi1+sayi2));
                break;
            case '-' :
                System.out.println("Sayilarin farki : " + (sayi1-sayi2));
                break;
            case '*' :
                System.out.println("Sayilarin carpimi :" + sayi1*sayi2);
                break;
            case '/' :
                System.out.println("Sayilarin bolumu : " + sayi1/sayi2);
                break;
            default:
                System.out.println("yanlis islem tercihi");
        }
    }
}
