package chap_07;

public class _06_ClassMethod {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.callServiceCenter();

        // 클래스 메소드는 클래스 변수로 접근하기
        BlackBox.callServiceCenter();

        String s = String.valueOf(3);
    }
}
