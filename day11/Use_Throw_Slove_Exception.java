package cn.itcast.day11;

public class Use_Throw_Slove_Exception {
    public static void main(String[] args) {
        ArrayOp();
    }

    public static int[] creatArray(){
        // 创建一个数组，通过数组的索引来访问元素
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++){
            arr[i] = i;
        }
        int[] arr1 = null;
        return arr1;
    }
    // 我们要对传过来的数组进行合法性校验，若arr的值为null，那么我们就抛出空指针异常
    // 这里的空指针异常，就是一个运行期异常，我们不需要处理，默认交给JVM处理
    // 若index的值不在数组的索引范围内，我们就抛出数组索引越界异常，显示"传递的索引不合法"
    public static int indexGetElement(int[] arr, int index){
        if(arr == null){
            throw new NullPointerException("传递的数组是空");
        }
        if(index < 0 || index > arr.length - 1){
            throw new ArrayIndexOutOfBoundsException("传递的索引不合法");
        }

        int element = arr[index];
        return element;
    }


    public static void ArrayOp(){
        int[] arr = creatArray();
        try{
            int element = indexGetElement(arr, 3);
            System.out.println(element);
        }catch (NullPointerException n){
            // n.getMessage();
            System.out.println(n.toString());
            // java.lang.NullPointerException: 传递的数组是空
        }catch (ArrayIndexOutOfBoundsException aiobe){
            System.out.println(aiobe.getMessage());
        }


    }
}
