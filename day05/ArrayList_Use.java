package cn.itcast.day05;
import java.util.ArrayList;
import java.util.Random;

public class ArrayList_Use {
    public static void main(String[] args) {
        // 产生6个1-33的整数，并添加到集合中
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for(int i = 0; i < 6; i++){
            int num = r.nextInt(33) + 1;
            list.add(num);
        }
        System.out.println(list);

        // 定义4个person类，添加到集合中，并进行遍历
        Person one = new Person("Walker",18);
        Person two = new Person("Garrett", 19);
        Person three = new Person("Jaccika", 22);
        Person four = new Person("liliy", 23);
        ArrayList<Person> person_list = new ArrayList<>();  // 自定义类型数组对象
        person_list.add(one);
        person_list.add(two);
        person_list.add(three);
        person_list.add(four);
        for(int i = 0; i < person_list.size(); i++){
            System.out.println("姓名：" + person_list.get(i).getName() + " 年龄：" + person_list.get(i).getAge());
        }


    }
}
