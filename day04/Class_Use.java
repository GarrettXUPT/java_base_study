package cn.itcast.day04;

public class Class_Use {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setAge(18);
        stu.setName("Walker");
        stu.eat();
        stu.sleep();
        stu.study();
        System.out.println(stu.getName());
        System.out.println(stu.getAge());
    }
}
