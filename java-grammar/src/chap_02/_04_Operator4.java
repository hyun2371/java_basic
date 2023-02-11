package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        //삼항 연산
//        결과 = (조건) ? (참의 경우 결과값) :(거짓의 경우 결과값)

        int x = 5;
        int y = 3;
        int max = (x > y) ? x : y;
        System.out.println("max = " + max);

        int min = (x < y) ? x : y;
        System.out.println("min = " + min);

        boolean b = (x == y) ? true : false;
        System.out.println("b = " + b);

        String s = (x != y) ? "다름" : "같음";
        System.out.println("s = " + s);

    }
}
