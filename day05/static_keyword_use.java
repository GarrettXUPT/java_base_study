package cn.itcast.day05;

public class static_keyword_use {
    public static void main(String[] args) {
        static_keyword stu1 = new static_keyword("Walker",22);
        static_keyword stu2 = new static_keyword("Garrett",23);
        stu1.class_room = 101;
        System.out.println("name = " + stu1.getName() + " age = " + stu1.getAge() + " class_room = " + stu1.class_room + " id = " + stu1.getId());
        System.out.println("name = " + stu2.getName() + " age = " + stu2.getAge() + " class_room = " + stu2.class_room + " id = " + stu2.getId());
        // name = Walker age = 22 class_room = 101 id = 1
        //name = Garrett age = 23 class_room = 101 id = 2

        // 通过类名称调用静态方法，而不需要创建对象，向一般方法，必须创建对象以后才能使用
        static_keyword.method();
    }
}
