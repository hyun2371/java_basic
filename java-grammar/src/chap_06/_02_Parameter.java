package chap_06;

public class _02_Parameter {

    public static void power(int n){
        System.out.println(n * n);
    }

    public static void powerByExp(int n, int e){
        int result = 1;
        for (int i = 0; i < e; i++) {
            result*=n;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        // 전달값, Parameter
        power(2);
        power(3);
        powerByExp(3,3);
    }
}
