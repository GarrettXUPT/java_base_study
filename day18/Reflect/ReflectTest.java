package cn.itcast.day18.Reflect;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/*
* 框架类
* */
public class ReflectTest {
     // 可以创建任意类的对象，可以执行任意方法，前提是不能去改变任意代码
     public static void main(String[] args) throws Exception {
         // 1、加载配置文件
         // 1.1 创建Properties对象
         Properties pro = new Properties();
         // 1.2 加载配置文件，转换为一个集合
         // 获取目录下配置文件的方式
         ClassLoader classLoader = ReflectTest.class.getClassLoader();
         InputStream is = classLoader.getResourceAsStream("pro.properties");
         pro.load(is);

         // 2、获取配置文件中定义的数据,若要改变使用的类，则改变配置文件即可，不需要改变这里的代码
         String classname = pro.getProperty("className");
         String methodName = pro.getProperty("methodName");

         // 3、使用反射，加载该类进内存
         Class cls = Class.forName(classname);
         // 4、创建对象
         Object obj = cls.newInstance();
         // 5、获取方法对象
         Method[] methods = cls.getMethods();
         for(Method ele : methods){
             System.out.println(ele);
         }

         Method method = cls.getMethod("sleep");
         method.invoke(obj);
         // 6、执行方法
//         methods.invoke(obj);

     }

}
