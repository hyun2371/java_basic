package chap_06;

public class _05_Overloading {
    /*
     메서드 오버로딩
     같은 이름의 메소드를 여러 번 선언
     1) 전달값의 타입이 다름
     2) 전달값의 개수가 다름
     */

    public static int power(int n){
        return n * n;
    }

    public static int power(String strN){
        int n = Integer.parseInt(strN);
        return n * n;
    }

    public static int power(int n, int e){
        int result = 1;
        for (int i = 0; i < e; i++) {
            result *= n;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("power(9) = " + power(9));
        System.out.println("power(\"9\") = " + power("9"));
        System.out.println("power(9,9) = " + power(9, 9));
    }
}
