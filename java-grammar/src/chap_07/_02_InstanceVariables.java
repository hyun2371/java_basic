package chap_07;

public class _02_InstanceVariables {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();

        b1.modelName = "까망이";
        b1.resolution = "FHD";
        b1.price = 20000;
        b1.color = "블랙";

        System.out.println("b1.modelName = " + b1.modelName);


        BlackBox b2 = new BlackBox();

        b2.modelName = "하양이";
        b2.resolution = "UHD";
        b2.price = 300000;
        b2.color = "화이트";

        System.out.println("b1.modelName = " + b1.modelName);
    }
}
