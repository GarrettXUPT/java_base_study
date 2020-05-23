package cn.itcast.day07;

public class Person_Use {
    public static void main(String[] args) {
        Person p1 = new Person("咕噜", 18);
        Person p2 = new Person("Walker", 19);
        boolean b = p1.equals(p2);  // 此处比较的是成员变量是否一致
        System.out.println(b);
    }
}
