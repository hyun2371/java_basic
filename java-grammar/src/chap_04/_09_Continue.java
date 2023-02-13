package chap_04;

public class _09_Continue {
    public static void main(String[] args) {
        //노쇼 손님 있다고 가정
        int max = 20;
        int sold = 0;
        int noShow = 17; // 노쇼한 대기 손님
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + "번 손님 주문한 치킨 나옴");

            if (i == noShow){
                System.out.println(i + "번 손님 노쇼. 다음사람에게 기회 넘어감");
                continue;
            }

            sold++;
            if (sold == max) {
                System.out.println("금일 재료 모두 소진됨");
                break;
            }
        }


        System.out.println("-------------");

        sold = 0;
        int index = 0;
        while (true) {
            index++;
            System.out.println(index + "번 손님 주문하신 치킨 나옴");

            if (index == noShow) {
                System.out.println(index + "번 손님 노쇼. 다음사람에게 기회 넘어감");
                continue;
            }
            sold++;
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진됨");
                break;
            }
        }
    }


}
