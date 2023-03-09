package chap_07;

public class _10_AccessModifier {
    public static void main(String[] args) {
        // 캡슐화
        // 정보 은닉

        //접근 제어자
        // private: 해당 클래스 내에서만 접근
        // public: 모든 클래스에서 접근
        // default: 같은 패키지 내에서만 접근
        // protected: 같은 패키지에서, 다른 패키지인 경우 자식 클래스에서 접근

        BlackBoxRefurbish b1 = new BlackBoxRefurbish();

        b1.modelName = "까망이";
        b1.resolution = "FHD";
        b1.setPrice(50000);

        b1.color = "블랙";

        System.out.println("==================");

        BlackBoxRefurbish b2 = new BlackBoxRefurbish("보랭이","UHD",250000,"purple");
        System.out.println("b1.getPrice() = " + b1.getPrice());
    }
}
