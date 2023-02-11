package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {

        int a = 5, b = 2, c = 4;
        System.out.println(a / b); //2
        System.out.println(b / c); //0


        //==증감 연산자==//
        int val = 10;
        System.out.println(++val); //11
        System.out.println(val);
        System.out.println(val++); //11
        System.out.println(val); //12


        //은행 대기번호 표
        int waiting = 0;
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 0
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 1
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 2
    }
}
