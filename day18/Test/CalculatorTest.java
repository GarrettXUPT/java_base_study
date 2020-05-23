package cn.itcast.day18.Test;

import cn.itcast.day18.Calculator.Calculate;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    /*
    * 初始化方法：
    *   用于资源的申请，所有测试方法在执行之前都会先执行该方法
    * */
    @Before
    public void init(){

    }

    /*
    * 释放资源的方法
    *   所有方法执行完毕以后都会自动执行该方法
    * */
    @After
    public void close(){

    }
    /*
    *   测试add方法
    * */
    @Test
    public void addTest(){
        // System.out.println("我被执行了");
        // 1、创建对象
        Calculate calculate = new Calculate();
        // 2、调用add方法
        int result = calculate.add(2, 3);
        // 在测试中不会将结果进行直接输出
        // 3、断言，输出结果应该是5
        Assert.assertEquals(5, result);
    }

    @Test
    public void subTest(){
        Calculate calculate = new Calculate();
        int result = calculate.sub(2, 3);
        Assert.assertEquals(-1, result);
    }
}
