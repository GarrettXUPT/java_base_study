package cn.itcast.day09;

import java.util.Objects;

/*
* Comparable和Comparator的区别：
*   Comparable：自己(this)和别人进行比较，自己需要实现Comparable的接口，重写比较的规则
*   Comparator：相当于找第三方的裁判来比较两个人
* */

// 要重写对Person的排序，所以事先Compare的Person类
public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // HashSet存储自己的对象，要将equals和hasCode方法进行重写
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    // 重写排序的规则
    @Override
    public int compareTo(Person person){
        // return 0; // 认为元素是相同的
        // 要自定义比较的规则，比较两个人的年龄，this及参数传递过来的Person
        return this.getAge() - person.getAge(); // 年龄升序排序
//        return person.getAge() - this.getAge(); // 此为降序排序
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
}
