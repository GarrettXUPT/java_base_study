package cn.itcast.day03;

public class overload {
    public static void main(String[] args) {
        int summary1 = sum(1, 2, 3);
        int summary2 = sum(1, 2, 3, 4);
        int method_re = method(1,1,1);
        System.out.println(summary2);
        System.out.println(method_re);
    }

    public static int sum(int a, int b){
        return a + b;
    }

    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d){
        return a + b + c + d;
    }

    public static boolean method(byte a, byte b){
        return a == b;
    }

    // 判断数据类型是否一致
    public static boolean method(int a, int b){
        return a == b;
    }

    public static boolean method(short a, short b){
        return a == b;
    }

    public static boolean method(char a, char b){
        return a == b;
    }

    public static int method(int a, int b, int c){
        if(a == c){
            return 1;
        }
        return 0;
    }
}
