package chap_01;

public class _01_Variables {
    public static void main(String[] args) {
        String name = "김뫄뫄";
        int hour = 15;

        System.out.println(name + "님, " + hour + "시에 배송이 시작됩니다");

        double score = 90.5;
        char grade = 'A';
        System.out.println(grade + "학점 컷은 " + score + "점 입니다");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + true);


        //정밀한 수 표현 -> double
        double d = 3.141233456789;
        float f = 3.14123456789f;
        System.out.println("f = " + f);
        System.out.println("d = " + d);


        //int i = 1000000000000; //정수형 범위 초과
        long l = 1000000000000L;
        l = 1_000_000_000_000L;   //윗줄과 같은 수
        System.out.println("l = " + l);



    }
}
