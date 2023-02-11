package chap_02;

public class _03_Operator3 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean isClear = false;
        boolean isWarm = true;
        boolean isHappy = false;

        System.out.println(isClear || isWarm || isHappy);
        System.out.println(isClear && isWarm && isHappy);

        System.out.println((5 > 3) && (3 > 1)); //true
        System.out.println((5 > 3) && (3 < 1)); //false

        System.out.println((5 > 3) || (3 > 1)); //true
        System.out.println((5 > 3) || (3 < 1)); //true

        System.out.println(!false); //true
    }
}
