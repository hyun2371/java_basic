package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        int hour = 10;
        int price = 0;
        boolean d = true;
        boolean s = false;
        
        for (int i = 0; i < hour; i++) {
            price += 4000;
            if (price>=30000){
                price = 30000;
                break;
            }
        }

        if (d||s){
            price /= 2;
        }

        System.out.println("price = " + price);
    }
}
