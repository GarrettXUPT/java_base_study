package cn.itcast.day11;

/*
* 要求：模拟注册操作，若用户名已经存在，则抛出异常并提示：该用户名已被注册
* 分析：
*   1、使用数组保存已经注册过的用户名
*   2、使用Scanner获取用户注册的用户名
*   3、定义一个方法，对用户输入的注册名进行判断
*       遍历已经存储注册用户的数组，获取每一个用户名
*       使用获取到的用户名和用户输入的用户名作比较，若没有重复则发出提示，说明注册成功
* */

import java.util.Scanner;

public class Demo_Exception_Use {

    static String[] UserNames = new String[]{"张三", "李四", "Garrett"};

    public static void main(String[] args) /* throws The_define_of_Exception */{
        System.out.println("请输入您要注册的用户名：");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();
        checkUsername(username);
    }

    // 定义一个方法，对用户输入的新注册名进行判断
    public static void checkUsername(String username) /*throws The_define_of_Exception*/ {
        for(String name : UserNames){
            if(name.equals(username)){
                try {
                    throw new The_define_of_Exception("该用户名已经被注册了");
                }catch (The_define_of_Exception the){
                    System.out.println(the.getMessage());
                }
            }
        }
        System.out.println("恭喜注册成功");
    }

}
