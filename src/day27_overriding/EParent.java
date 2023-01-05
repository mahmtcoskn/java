package day27_overriding;

public class EParent extends DGrandParent{

    @Override
    protected void method1() {
        System.out.println("P method1");

        // @Override notasyonu overriden method ile overriding methodu ilisiklendirir
        // eger overriden method da bu iliskiyi bozacak bir degisiklik yapilirsa
        // @Override CTE verir
    }
    protected void method2(){
        System.out.println("P method2");
    }
    private void method3(){
        System.out.println("P method3");
    }
}
