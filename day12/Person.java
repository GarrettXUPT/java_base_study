package cn.itcast.day12;

public class Person {

    private String name;

    public void run(){
        // 定义一个循环，执行20次
        for(int i = 0; i < 20; i++){
            System.out.println(name + "---" + i);
        }
    }

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}