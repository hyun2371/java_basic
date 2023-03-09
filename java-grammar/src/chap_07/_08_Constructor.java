package chap_07;

public class _08_Constructor {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();

        b1.modelName = "까망이";
        b1.resolution = "FHD";
        b1.price = 20000;
        b1.color = "블랙";

        System.out.println("==================");

        BlackBox b2 = new BlackBox("보랭이","UHD",25000,"purple");
        System.out.println("b2.price = " + b1.price);
    }
}
