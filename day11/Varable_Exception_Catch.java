package cn.itcast.day11;

import java.util.List;

public class Varable_Exception_Catch {
    public static void main(String[] args) {


    }

    // 多个异常多次处理
    public static void show01(){
        try {
            int[] arr = new int[]{1, 2, 3};
            System.out.println(arr[3]);  // ArrayIndexOutOfBoundsException
        }catch (ArrayIndexOutOfBoundsException a){
            System.out.println(a.getMessage());
        }

        try {
            List<Integer> list = List.of(1, 2, 3);
            System.out.println(list.get(3));  // ArrayIndexOutOfBoundsException
        }catch (ArrayIndexOutOfBoundsException a){
            System.out.println(a.getMessage());
        }
    }

    // 一次捕获多个异常，进行多次处理
    public static void show02(){
        try {
            int[] arr = new int[]{1, 2, 3};
            System.out.println(arr[3]);  // ArrayIndexOutOfBoundsException

            List<Integer> list = List.of(1, 2, 3);
            System.out.println(list.get(3));  // ArrayIndexOutOfBoundsException

        }catch (ArrayIndexOutOfBoundsException a){
            System.out.println(a.getMessage());
        }catch (IndexOutOfBoundsException i){
            System.out.println(i.getMessage());
        }
    }

    // 一次捕获多个异常，进行一次处理
    public static void show03(){
        try {
            int[] arr = new int[]{1, 2, 3};
            System.out.println(arr[3]);  // ArrayIndexOutOfBoundsException

            List<Integer> list = List.of(1, 2, 3);
            System.out.println(list.get(3));  // ArrayIndexOutOfBoundsException

        }catch (Exception a) {
            System.out.println(a.getMessage());
        }
    }
}
