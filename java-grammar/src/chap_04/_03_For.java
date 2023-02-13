package chap_04;

public class _03_For {
    // for (선언; 조건; 증감)
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
        }
        System.out.println();

        //fori 단축키
        for (int i = 0; i < 10; i += 2) {
            System.out.print(i);
        }
        System.out.println();

        for (int i = 5; i > 0; i--) {
            System.out.print(i);
        }
        System.out.println();

        int sum = 0;
        for (int i = 0 ;i<=10;i++){
            sum += i;
        }
        System.out.println("sum = " + sum);
    }


}
