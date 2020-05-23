package cn.itcast.day04;

public class Person_Use {
    public static void main(String[] args) {
        Person person = new Person("Walker", 22);  // 调用的是全参数的构造方法
        int age = person.getAge();
        String name = person.getName();
        System.out.println("姓名：" + name + " 年龄：" + age);
    }
}
