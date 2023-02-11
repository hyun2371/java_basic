package chap_01;

public class _Quiz_01 {
    public static void main(String[] args) {
        int busNum = 2323;
        int remainMin = 9;
        double remainDis = 1.8;
        final String DIS_MEASURE = "km";

        System.out.printf("%d번 버스\n약 %d분 후 도착\n남은 거리 %.1f %s",
                busNum, remainMin, remainDis, DIS_MEASURE);

    }
}
