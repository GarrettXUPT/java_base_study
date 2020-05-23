package cn.itcast.day05;

public class static_keyword {
    private String name;
    private int age;
    private int id = 0;
    static int class_room;
    private static int id_counter = 0;  // 学号计数器

    public static_keyword(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++id_counter;  // 全参数构造函数
    }

    public static_keyword() {
        id = ++id_counter;
    }  // 无参构造函数，只要一创建对象，则静态

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void method(){
        System.out.println("你说这是什么");
    }
}
