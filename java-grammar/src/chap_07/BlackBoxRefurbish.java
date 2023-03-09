package chap_07;

public class BlackBoxRefurbish {
    public String modelName;
    String resolution;
    private int price;
    public String color;

    public BlackBoxRefurbish() {
    }

    public BlackBoxRefurbish(String modelName, String resolution, int price, String color) {
        this.modelName = modelName;
        this.resolution = resolution;
        this.price = price;
        this.color = color;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price){
        System.out.println("price = " + price);
        if (price<100000){
            this.price = 100000;
        }
        else {
            this.price = price;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class A {

}
