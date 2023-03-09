package chap_07;

import java.util.Random;

public class _11_Package {
    public static void main(String[] args) {
        //패키지
        Random random = new Random();

        //int 범위 내에서 정수형 값 반환
        System.out.println("랜덤 정수: " + random.nextInt(0,10));
        System.out.println("랜덤 실수: " +random.nextDouble(0,10));


        // 5.0 이상 10.0 미만 실수 뽑기
        double min = 5.0;
        double max = 10.0;

        System.out.println("로또 번호: " + (random.nextInt(45) + 1));
    }
}
