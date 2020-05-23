package cn.itcast.day11;

public class Try_Catch_Slove_Exception {



    public static int[] creatArray(){
        // 创建一个数组，通过数组的索引来访问元素
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++){
            arr[i] = i;
        }
        return arr;
    }

    public static int indexGetElement(int[] arr, int index){

        int element = arr[index];
        return element;
    }

    public static void ArrayOp(){
        int[] arr = creatArray();
        int element = indexGetElement(arr, 3);
        System.out.println(element);
    }
}
