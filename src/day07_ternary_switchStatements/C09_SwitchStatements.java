package day07_ternary_switchStatements;

public class C09_SwitchStatements {
    public static void main(String[] args) {

        // kullanicidan gun nosu alip gün adi yazin

        int gunNo = 9;

        switch (gunNo){
            case 1:
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                System.out.println("hafta ici");
                break;
            case 6 :
            case 7 :
                System.out.println("hafta sonu");
                break;
            default:
                System.out.println("Gecersiz gun numarasi");
        }
    }
}
