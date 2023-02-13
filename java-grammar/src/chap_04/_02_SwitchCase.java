package chap_04;

public class _02_SwitchCase {
    public static void main(String[] args) {
        /*
    석차에 따른 장학금 지급
    1등, 2등, 3등, 그외
     */

        int rank = 3;
        switch(rank){
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 미지급 대상");
        }

        //중고등급에 따른 가격 책정 (1,2,3등급)
        int grade = 1;
        int price = 7000;
        switch (grade) {
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
        }
        System.out.println(grade+"등급 제품의 가격: "+price+"원");

        /*
        if else -> 여러 범위에 해당하는 조건
        switch case-> 명확한 케이스가 있는 경우
         */
    }

}
