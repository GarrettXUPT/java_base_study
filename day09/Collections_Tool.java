package cn.itcast.day09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Collections_Tool {
    public static void main(String[] args) {
        demo03();
    }

    public static void demo01(){
        ArrayList<String> arrayList = new ArrayList<>();

        // 向集合中添加多个元素
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        System.out.println(arrayList);  // [a, b, c]

        // 将后续数组整体加入集合中
        Collections.addAll(arrayList, "d", "e", "f");
        System.out.println(arrayList);  // [a, b, c, d, e, f]

        // 打乱集合中元素的顺序
        Collections.shuffle(arrayList);
        System.out.println(arrayList);  // [b, f, c, a, d, e]
    }

    public static void demo02(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(1);
        // 使用sort方法排序,默认是升序
        Collections.sort(arrayList);
        System.out.println(arrayList);  // [1, 2, 3]

        Person p1 = new Person("张三",12);
        Person p2 = new Person("李四",23);
        Person p3 = new Person("王五",18);

        ArrayList<Person> list = new ArrayList<>();
        Collections.addAll(list, p1, p2, p3);
        Collections.sort(list);  // 重写compareto
        System.out.println(list);
        // [Person{name='张三', age=12}, Person{name='王五', age=18}, Person{name='李四', age=23}]
    }

    public static void demo03(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(1);
        // 利用Comparator进行排序，使用匿名类重写比较的规则
        Collections.sort(arrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return integer - t1; // 升序排序,若两个值相同，那么哪个值写在前面就将其排在前面
            }
        });
        System.out.println(arrayList);  // [1, 2, 3]

        Person p1 = new Person("张三",12);
        Person p2 = new Person("李四",23);
        Person p3 = new Person("王五",18);
        Person p4 = new Person("赵六",18);
        ArrayList<Person> list = new ArrayList<>();
        Collections.addAll(list, p1, p2, p3, p4);
        // 使用匿名内部类来比较年龄和姓
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person person, Person t1) {
                int result = person.getAge() - t1.getAge();  // 升序排序
                // 若年龄相同则使用名字的第一个字进行排序
                if(result == 0){
                    return person.getName().charAt(0) - t1.getName().charAt(0);
                }
                return result;
            }
        });
        System.out.println(list);
        // [Person{name='张三', age=12}, Person{name='王五', age=18}, Person{name='李四', age=23}]
        // [Person{name='张三', age=12}, Person{name='王五', age=18}, Person{name='赵六', age=18}, Person{name='李四', age=23}]
    }
}
