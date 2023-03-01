package chap_06;

public class _04_ParameterAndReturn {

    public static int power(int n){
        return n * n;
    }

    public static int powerByExp(int n, int e){
        int result = 1;
        for (int i = 0; i < e; i++) {
            result *= n;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(power(9));
        System.out.println(powerByExp(2, 5));
    }
}
