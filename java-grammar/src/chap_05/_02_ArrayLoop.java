package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        // 배열의 순회
        String[] coffees = new String[]{"아메리카노", "카페모카", "라떼", "카푸치노"};

        for (int i=0;i<coffees.length;i++){
            System.out.println(coffees[i] + " 하나");
        }

        System.out.println("-------------------");

        //for each 반복문 (처음부터 끝까지 반복할 때)
        for (String coffee : coffees){
            //coffees의 값들을 coffee로 하나씩 받아서 순회
            System.out.println(coffee + " 하나");
        }
    }
}

