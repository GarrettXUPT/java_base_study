package cn.itcast.day03;

public class arry_method {
    public static void main(String[] args) {
        // 数组的创建
        // 动态初始化数组
        int[] arr1 = new int[20];
        double[] arr2 = new double[20];
        char[] arr3 = new char[20];

        // 静态初始化数组
        int[] arr4 = new int[] {1, 2, 3, 4, 5};

        String[] arr5 = new String[]{"hello", "world"};

        int[] arr6 = {1, 3, 4, 6};

        // System.out.println(arr6); // 内存地址哈希值 [I@3cbbc1e0
        int len = arr6.length;

        // 遍历数组
        // System.out.println(len);
        for(int i = 0; i < len; i++){
            // System.out.println(arr6[i]);
        }

        // 求出数组当中的最大值
        int max = arr6[0];
        for(int i = 0; i < len; i++){
            if(max < arr6[i]){
                max = arr6[i];
            }
        }
        System.out.println("max = " + max);

        // 数组元素翻转
        for(int i = 0; i < len / 2; i++){
            int tmp = arr6[i];
            arr6[i] = arr6[len - i - 1];
            arr6[len - i - 1] = tmp;
        }
        for(int i = 0; i < len; i++){
            // System.out.println(arr6[i]);
        }
        // 打印翻转以后的结果
        array_method(arr6);

        // 数组型返回值的应用
        int sum = array(arr6)[0];
        int average = array(arr6)[1];
        System.out.println("sum = " + sum + " average = " + average);
    }

    // 数组作为参数进行传递
    public static void array_method(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    // 数组作为返回值
    public static int[] array(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum = array[i] + sum;
        }
        int average = sum / array.length;
        // int[] arr = new int[]{sum, average};
        int[] arr = {sum, average};
        return arr;
    }


}
