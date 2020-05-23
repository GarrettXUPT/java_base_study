package cn.itcast.day15;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVarsionID = 1L;  // 自己设定序列化时使用的ID，防止class文件被修改后，出现反序列化对象的不能使用
    private String name;
    public int age;

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
                '}';
    }
}
