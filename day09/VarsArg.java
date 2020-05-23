package cn.itcast.day09;

public class VarsArg {
    public static void main(String[] args) {
        int sum = sum(1, 2, 3, 4);
        System.out.println(sum);  // 10

    }

    // 定义一个方法，计算两个int型数据的和
    private static int sum(int...ele){
        int sum = 0;
        for(int i : ele){
            sum = i + sum;
        }
        return sum;
    }

    public static void method(Object...obj){
    }

}
