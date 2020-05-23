package cn.itcast.day07;

public class Person {
    int age;
    String name;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

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
    // 重写equals
    @Override
    public boolean equals(Object obj){
        // 若传入对象就是当前对象，直接返回true
        if(obj == this){
            return true;
        }
        // 若传入对象为空，则直接返回false，提高程序的效率
        if(obj == null){
            return false;
        }
        // 增加判断语句，以防出现类型转换异常
        if(obj instanceof Person){
            // 使用向下转型，将obj转化为Person类型
            Person p = (Person)obj;
            // 比较两个对象的属性一个对象是p1一个对象是obj
            boolean b = this.name.equals(p.name) && this.age == p.age;
            return b;
        }
        // 不是Person类型，直接返回false
        return false;
    }
}
