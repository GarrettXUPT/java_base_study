package cn.itcast.day04;

public class Phone_Class {
    // 成员变量
    private String color;
    private String brand;
    private int price;

    public Phone_Class() {
    }

    public Phone_Class(String color, String brand, int price) {
        this.color = color;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone_Class{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // 成员方法
    public void call(String name){
        System.out.println("给" + name + "打电话");
    }

    public void message(String name){
        System.out.println("给" + name + "发短信");
    }
}
