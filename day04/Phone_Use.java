package cn.itcast.day04;

public class Phone_Use {
    public static void main(String[] args) {
        Phone_Class phone_one = new Phone_Class(); // 使用的是无参的构造函数
        Phone_Class phone_two = method(phone_one);
        System.out.println("手机价格" + phone_two.getPrice());
        System.out.println("手机品牌" + phone_two.getBrand());
        System.out.println("手机颜色" + phone_two.getColor());
    }

    // 对象作为参数传递
    public static Phone_Class method(Phone_Class phone){
        phone.setPrice(2000);
        phone.setBrand("HUAWEI");
        phone.setColor("red");
        // phone.call("Garrett");
        // phone.message("Walker");
//        System.out.println("手机价格" + phone.price);
//        System.out.println("手机品牌" + phone.brand);
//        System.out.println("手机颜色" + phone.color);
        return phone;
    }
}
