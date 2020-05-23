package cn.itcast.day02;

public class circle_methods {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++)
        {
            System.out.println("你好");
        }

        int i = 0;
        while (i < 9)
        {
            System.out.println("好什么好");
            i++;
        }

        int j = 0;
        do {
            System.out.println("有多好");
            j++;
            if(j == 5){
                System.out.println("算了，原谅你了");
                break;
            }

        }while (j < 9);

        System.out.println("程序停止 " + "i = " + i + "; j = " + j);

        // 0-100的偶数和
        int sum = 0;
        for(int t = 0; t <= 100; t = t + 2){
            sum = t + sum;
        }
        System.out.println("sum = " + sum);

        // 时钟
        for(int hour = 0; hour < 24; hour++){
            for(int minate = 1; minate < 60; minate++){
                System.out.println("当前时刻" + hour + "hour : " + minate + " minate");
            }
        }

    }
}
