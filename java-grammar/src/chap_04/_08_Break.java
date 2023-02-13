package chap_04;

public class _08_Break {
    public static void main(String[] args) {
        int max = 20;
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + "번 손님, 주문하신 떡볶이 나왔습니다");
            if (i == max) {
                System.out.println("금일 재료가 모두 소진됨");
                break;
            }
        }
        System.out.println("영업종료");
        System.out.println("----------------------");

        int index = 1;
        while (index <= 50) {
            System.out.println(index + "번 손님, 주문하신 치킨 나옴");
            if (index == max){
                System.out.println("금일 재료가 모두 소짐됨");
                break;
            }
            index++;
        }
        System.out.println("영업 종료함");
    }
}
