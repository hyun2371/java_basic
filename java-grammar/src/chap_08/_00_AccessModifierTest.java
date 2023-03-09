package chap_08;

//import chap_07.A;
import chap_07.BlackBox;
import chap_07.*;  // 다른 패키지의 클래스 사용

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까미";
//        b1.price = 10000;
//        b1.resolution = "ddd"; default -> 같은 패키지 내에서 접근 가능

//        A a = new A(); // default 클래스 접근 불가


    }
}
