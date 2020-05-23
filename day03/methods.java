package cn.itcast.day03;

public class methods {
    public static void main(String[] args) {
//        demo1();
//        int res = sum(2, 3);
//        System.out.println("res: " + res);
//        judge(2, 3);
        total();
        print_method(4);
    }

    public static void demo1(){
        System.out.println("你好啊");
    }

    public static int sum(int a, int b){
        int sum = a + b;
        return sum;
    }

    // 判断两数字是否相同
    public static void judge(int a, int b){
        if(a == b){
            System.out.println("两数字相同");
        }else{
            System.out.println("两数字不同");
        }
    }
    // 计算0-100的和
    public static void total(){
        int sum = 0;
        for(int i = 0; i <= 100; i++){
            sum = i + sum;
        }
        System.out.println("sum = " + sum);
    }
    // 打印指定次数的helloworld
    public static void print_method(int num){
        for(int i = 0; i < num; i++){
            System.out.println("HelloWorld");
        }
    }


}
