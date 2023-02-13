package chap_04;

public class _04_While {
    public static void main(String[] args) {
        int distance = 25;
        int move = 0;

        while (move < distance) { //현재 이동 거리< 전체 거리
            System.out.println("발차기를 계속 한다");
            System.out.println("현재 이동 거리: " + move);
            move += 3;
        }
        System.out.println("도착함");
    }
}
