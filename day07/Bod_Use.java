package cn.itcast.day07;

public class Bod_Use {
    public static void main(String[] args) {
        Body body = new Body();
        // 通过外部类的对象调用外部类的方法，然后里面间接再使用内部类Heart
        body.methodBody();
        // 使用公式直接调用内部类方法
        Body.Heart heart = new Body().new Heart();
        heart.methodHeart();

        // 使用局部内部类
        Body body1 = new Body();
        body1.methodOuter();

    }
}
