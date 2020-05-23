package cn.itcast.day18.ReflectDomain;

public class Person {
    private String name;
    private int age;
    public String a;
    public String b;


    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", a='" + a + '\'' +
                ", b='" + b + '\'' +
                '}';
    }

    public void eat(int times){
        System.out.println("eat......");
    }

    public void sleep(){
        System.out.println("sleep...........");
    }

    public void eat(){
        System.out.println("eat......");
    }
}
