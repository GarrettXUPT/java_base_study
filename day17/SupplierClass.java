package cn.itcast.day17;

import java.util.function.Supplier;

public class SupplierClass {

    public static void main(String[] args) {
        String str = getString(()->"Garrett");
        System.out.println(str);

        int[] ints = new int[]{2, 5, 8, 1, 3, 2, 7};
        int maxValue = getMax(()->{
            int max = ints[0];
            for(int i = 1; i < ints.length; i++){
                if(ints[i] > max){
                    max = ints[i];
                }
            }
            return max;
        });
        System.out.println(maxValue);
    }

    // 定义一个方法，方法的参数传递Supplier接口，泛型指定String类型,get方法后返回一个String类型
    public static String getString(Supplier<String> sup){
        return sup.get();
    }

    // 求数组中元素的最大值，使用supplier接口，通过lambda表达式求出数组中的最大值,这里生产的就是整型数字
    public static Integer getMax(Supplier<Integer> supplier){
        return supplier.get();
    }
}
