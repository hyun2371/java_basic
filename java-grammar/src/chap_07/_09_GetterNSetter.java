package chap_07;

public class _09_GetterNSetter {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까미";
        b1.resolution = "FHD";
        b1.price = 200000;
        b1.color = "블랙";

        b1.price = -5000;
    }
}
