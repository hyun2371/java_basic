package chap_04;

public class _06_NestedLoop {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-------------------");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-------------------");

        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        /*
        i = 0    j=5~1
        i = 1    j=5~2
         */

        System.out.println("-------------------");

        /*
        ssss*
        sss**
        ss***
        s****
        *****
         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <5-i-1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
