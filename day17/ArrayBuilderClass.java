package cn.itcast.day17;

public class ArrayBuilderClass {
    // 定义一个方法，方法的参数传递创建数组的长度和ArrayBuilder接口，方法内部根据传递的长度使用ArrayBuilder中的创建数组返回
    public static int[] creatArray(int length, ArrayBuilder arrayBuilder){
        return arrayBuilder.builderArray(length);
    }

    public static void main(String[] args) {
        int[] aray = creatArray(10, (len) -> new int[len]);
        System.out.println(aray.length);  // 10

        // 使用方法引用
        int[] array = creatArray(9, int[]::new);
        System.out.println(array.length); // 9

    }
}
