package cn.itcast.day17;

import java.util.Comparator;

/*
*  例如java.lang.Runnable就是一个函数式接口
*  假设有一个startThread方法使用接口为参数，那么就可以使用lambda进行传参
*  这种情况其实和Thread类的构造方法参数作为Runnable没有任何区别
* */
public class LambdaPractice {

    public static void main(String[] args) {
        // 调用startThread方法，方法的参数是一个接口，那么我们可以传递接口的匿名内部类
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "---->" + "线程已经启用");
            }
        });

        // 使用lambda表达式优化
        startThread(()-> System.out.println(Thread.currentThread().getName() + "---->" + "线程已经启用"));
    }

    // 定义一个方法startThread，方法的参数使用函数式接口和Runnable
    public static void startThread(Runnable runnable){
        // 开启线程
        new Thread(runnable).start();
    }

    // 若一个方法的返回值是函数式接口，就可以返回lambda表达式，当需要一个方法获取一个java.util.Comparable接口类型的对象作为排序器，可以使用该方法获取
    // 定义一个方法，方法的返回值类型使用函数式接口Comparator
    public static Comparator<String> getComparator(){
        // 方法返回值类型是一个接口，那么我们可以返回接口的匿名内部类
//        return new Comparator<String>(){
//            @Override
//            public int compare(String s, String t1) {
//                return t1.length() - s.length();  // 保持降序
//            }
//        };

        // 使用lambda表达式进行优化
        // return (String o1, String o2)->{ return o2.length() - o1.length();};

        // lambda表达式的改进
        return (String o1, String o2) ->o2.length() - o1.length();
    }

}
