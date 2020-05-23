package cn.itcast.day13;

/*
*   需求(Example1)：
*       给定一个厨子Cook接口，内含唯一的抽象方法makeCook()，且无参数，无返回值
*       使用lambda标准格式调用interface方法，打印输出字样即可
*   需求(Example2):
*       使用数组存储多个Person对象
*       对数组中的Person对象使用Array的sort方法通过年龄进行排序
* */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Lambda_example {
    public static void main(String[] args) {
        //

    }

    public static void example3(){
        invokeCal((new Calculate() {
            @Override
            public int sum(int... a) {
                int sum = 0;
                for(int i = 0; i < a.length; i++){
                    sum = a[i] + sum;
                }
                return  sum;
            }
        }),2,4,5,6);
    }

    public static void invokeCal(Calculate cal, int...a){
        int sum = cal.sum(a);
        System.out.println("sum = " + sum);
    }

    public static void example2(){
        // 使用数组存储多个Person对象
        Person[] arr = new Person[]{
                new Person("Walker",23),
                new Person("Garrett",14),
                new Person("Regita",42)
        };

        // 对数组中的Person对象使用Array的sort方法通过年龄生序排序
//        Arrays.sort(arr, new Comparator<Person>() {
//            @Override
//            public int compare(Person person, Person t1) {
//                return person.getAge() - t1.getAge();
//            }
//        });

        // 使用lambda表达式简化匿名内部类
        Arrays.sort(arr, (Person o1, Person o2)->{
            return o1.getAge() - o2.getAge();
        });

        // 优化版
        Arrays.sort(arr, (o1, o2)->o1.getAge() - o2.getAge());


        // 遍历数组
        for(Person person : arr){
            System.out.println(person);
        }
    }

    public static void example1(){
        // 调用invokeCook方法，参数是接口对象，传递Cook接口匿名类对象,只适用于一个接口或者类中只有一个抽象方法
        invokeCook(new Lambda_Exmaple_interface(){
            @Override
            public void makeCook() {
                System.out.println("我要当大佬");
            }
        });

        invokeCook(()->{
            System.out.println("就你还想当大佬啊");
        });

        // 优化版
        invokeCook(()-> System.out.println("就你还想当大佬啊"));

    }

    // 定义一个方法，参数传递Cook接口，方法内部调用Cook接口的makeCook方法
    public static void invokeCook(Lambda_Exmaple_interface lei){
        lei.makeCook();
    }

}
