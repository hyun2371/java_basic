package chap_04;

public class _05_DoWhile {
    public static void main(String[] args) {
        int distance = 30; //수영장 전체 거리
        int move = 0; //현재 이동거리
        int height = 25;

        System.out.println("-----반복문#2------");
        while (move + height < distance) {
            System.out.println("발차기를 계속 함");
            System.out.println("현재 이동 거리: " + move);
            move += 3;
        }
        System.out.println("도착함");

        move = 0;
        height = 25;

        System.out.println("-----반복문#2------");

        do{
            System.out.println("발차기를 계속합니다");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        } while(move + height<distance);
        System.out.println("도착했습니다");


    }
}
