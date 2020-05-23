package cn.itcast.day04;

public class Person {
    private String name;  // 姓名
    private int age;  // 年龄

    // 无参数构造函数
    public Person() {
    }
    // 全参数构造函数
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // 成员变量的获取与设置
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
