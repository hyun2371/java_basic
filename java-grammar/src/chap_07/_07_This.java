package chap_07;

public class _07_This {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까미";
        b1.appendModelName("(최신형)");
        System.out.println("b1 = " + b1.modelName);
    }
}
