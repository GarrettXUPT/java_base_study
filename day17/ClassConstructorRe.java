package cn.itcast.day17;

// 类的构造器(构造方法)引用，
public class ClassConstructorRe {
    // 定义一个方法，参数传递姓名和PersonBuilder接口，通过姓名创建Person对象
    public static void printName(String name, PersonBuilder personBuilder){
        Person person = personBuilder.builderPerson(name);
        System.out.println(person.getName());
    }

    public static void main(String[] args) {
        printName("Garrett", names -> new Person(names));

        // 使用方法引用优化lambda,创建一个Person对象
        printName("Walker", Person::new);
    }

}
