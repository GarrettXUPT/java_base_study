package cn.itcast.day07;

import java.lang.reflect.Array;
import java.util.Arrays;

public class System_Class {
    public static void main(String[] args) {
        // demo01();
        demo02();
    }

    /*
    *static long currentTimeMillis() 返回当前时间，以毫秒为单位
    * 可用来测试程序的效率
    * */
    private static void demo01(){
        int sum = 0;
        // 打印循环10000次的耗时
        long start = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++){
            sum = i + sum;
            System.out.println(sum);
        }
        long end = System.currentTimeMillis();
        long during = end - start;
        System.out.println("该程序运行时间为：" + during);
    }
    /*
    *  static void arrayCopy(Object src, int srcPos, Object dest, int destPos, int length)
    *  将指定源数组中的数组从指定位置复制到目标数组的指定位置
    *  参数：Object src 源数组
    *       srcPos 源数组起始位置
    *       Object dest 目标数组
    *       int detPos 目标数组起始位置
    *       int length 需要复制的数组长度
     * */
    private static void demo02(){
        // 定义源数组
        int[] src = {1, 2, 3, 4, 5};
        // 定义目标数组
        int[] dest = {6, 7, 8, 9, 10};
        System.out.println("复制前的数组：" + Arrays.toString(dest));
        // 将源数组的前三个元素，复制到目标数组的前三个位置上，将原来数组上前三个元素删除
        System.arraycopy(src, 0, dest, 0, 3);
        System.out.println("复制后数组：" + dest);
        for(int ele : dest){
            System.out.println(ele); // 1 2 3 9 10
        }
    }
}
