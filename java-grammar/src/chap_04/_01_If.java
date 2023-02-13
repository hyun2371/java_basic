package chap_04;

public class _01_If {
    public static void main(String[] args) {

        int hour = 10;

        boolean morningCoffee = true;
        if (hour<14 && !morningCoffee){
            System.out.println("아아 +1");
        } else {
            System.out.println("디카페인 아아 +1");
        }
        System.out.println("커피 주문 완료");


        boolean lemonAde = true;
        boolean mangoJuice = true;

        if (lemonAde){
            System.out.println("레몬 에이드 주문");
        } else if (mangoJuice){
            System.out.println("망구 주스 주문");
        } else{
            System.out.println("아아 주문");
        }
    }
}
