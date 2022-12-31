package day04_Increment_Concatenation;

public class C02_Pre_PostIncrement {
    public static void main(String[] args) {

        int a = 10;
        int b = a++;
        int c = ++a;

        System.out.println(a + ", " + b + ", "+c);   // 12 , 10 , 12

    }
}
