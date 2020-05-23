package cn.itcast.day18.Reflect;

import cn.itcast.day18.ReflectDomain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo02 {
    /*
    * class对象的功能：
        获取功能：
            1、获取成员变量
                Field[] getField()  获取所有public修饰的成员变量
                Field getField(String name)
                Field[] getDeclareFields()
                Field getDeclareFields(String name)
            2、获取构造方法
                Constructor<?>[] getConstructor()
                Constructor<T> getConstructors(类<?>...parameterTypes)

                Constructor<?>[] getDeclareConstructor()
                Constructor<T> getDeclareConstructors(类<?>...parameterTypes)
            3、获取成员方法
                Method[] getMethods()
                Method getMethod(String name, 类<?>...parameterType)
                Method[] getDeclareMethods()
                Method getDeclareMethod(String name, 类<?>...parameterType)
            4、获取类名
                String getName()
    * */
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        // 0、获取Person的Class对象
        Class<Person> personClass = Person.class;
        /*
        * 获取成员变量
        * Field[] getField()  获取所有public修饰的成员变量
          Field getField(String name)  获取指定名称的public修饰的成员变量
          Field[] getDeclareFields()  获取所有的成员变量，不考虑公有私有
          Field getDeclareFields(String name)
        * */
        // 1、Field[] getField()  获取所有public修饰的成员变量
        Field[] fields = personClass.getFields();
        for(Field ele : fields){
            System.out.println(ele);
        }
            // public java.lang.String cn.itcast.day18.ReflectDomain.Person.a
            // public java.lang.String cn.itcast.day18.ReflectDomain.Person.b

        // 2、Field getField(String name)  获取指定名称的public修饰的成员变量
        Field a = personClass.getField("a");
        System.out.println(a);  // public java.lang.String cn.itcast.day18.ReflectDomain.Person.a

        // 3、获取成员变量的值
        Person p = new Person();
        Object value = a.get(p);  // 获取成员变量的值
        System.out.println(value);  // 默认初始化成员变量null
        a.set(p, "Garrett");  // 设定成员变量的值
        System.out.println(p);  // Person{name='null', age=0, a='Garrett', b='null'}

        // 4、Field[] getDeclareFields()  获取所有的成员变量，不考虑公有私有
        Field[] declaredFields = personClass.getDeclaredFields();
        for(Field ele : declaredFields){
            System.out.println(ele);
        }
            // private java.lang.String cn.itcast.day18.ReflectDomain.Person.name
            //private int cn.itcast.day18.ReflectDomain.Person.age
            //public java.lang.String cn.itcast.day18.ReflectDomain.Person.a
            //public java.lang.String cn.itcast.day18.ReflectDomain.Person.b

        // 5、Field getDeclareFields(String name)
        Person p1 = new Person();
        Field a1 = personClass.getDeclaredField("a");
        a1.set(p1, "Garrett");  // 该处不可获取也不可修改私有变量
        Object value1 = a1.get(p1);
        System.out.println(p1);  // Person{name='null', age=0, a='Garrett', b='null'}
            //若在此处一定要使用私有变量,那么就要忽略修饰符的安全检查
        Field name = personClass.getDeclaredField("name");
        name.setAccessible(true);  // 暴力反射
        name.set(p1, "Walker");
        Object name2 = name.get(p1);
        System.out.println(p1);  // Person{name='Walker', age=0, a='Garrett', b='null'}

        /*
        * 获取构造方法
        * Constructor<?>[] getConstructor()
          Constructor<T> getConstructors(类<?>...parameterTypes)
          Constructor<?>[] getDeclareConstructor()
          Constructor<T> getDeclareConstructors(类<?>...parameterTypes)
        * */

        // Constructor<T> getConstructors(类<?>...parameterTypes)
        Constructor<Person> constructor1 = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor1);  // public cn.itcast.day18.ReflectDomain.Person(java.lang.String,int)
        Person obj1 = constructor1.newInstance("Garrett", 21);
        System.out.println(obj1);  // Person{name='Garrett', age=21, a='null', b='null'}
        // 使用空参构造函数创建对象
        Constructor<Person> constructor2 = personClass.getConstructor();
        Person obj2 = constructor2.newInstance();
        System.out.println(obj2);  // Person{name='null', age=0, a='null', b='null'}
        // 使用空参构造函数创建对象时可以简化的，简化为Class对象的newInstance方法
        Person obj3 = personClass.newInstance();
        System.out.println(obj3);  // Person{name='null', age=0, a='null', b='null'}

        /*
        *  获取成员方法
            Method[] getMethods()
            Method getMethod(String name, 类<?>...parameterType)
            Method[] getDeclareMethods()
            Method getDeclareMethod(String name, 类<?>...parameterType)
        * */
        // 获取指定名称的方法(方法名，参数列表)
        Method eatMethod = personClass.getMethod("eat", int.class);
        Person person = new Person();
        eatMethod.invoke(person, 11);  // eat......

        // 获取所有public修饰的方法,所有的方法中不只有自己定义的，还有一些Object方法
        Method[] methods = personClass.getMethods();
        for(Method method : methods){
//            System.out.println(method);
//            method.setAccessible(true);  也支持暴力反射
            System.out.println(method.getName());  // 获取方法的名称
        }

        /*
        *  获取类名
            String getName()
        * */
        String className = personClass.getName();
        System.out.println(className);  // cn.itcast.day18.ReflectDomain.Person
    }
}
