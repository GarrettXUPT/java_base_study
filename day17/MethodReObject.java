package cn.itcast.day17;

public class MethodReObject {
    // 定义一个成员方法，传递字符串，将字符串大写输出
    public void printUpperCaseString(String str){
        System.out.println(str.toUpperCase());
    }

    public static void printString(PrintAble printAble){
        printAble.print("Hello Garrett");
    }

    // 通过对象名引用成员方法
    public static void main(String[] args) {
        // 调用printString方法，方法的参数Printable是一个函数式接口，所以可以传递lambda表达式
        printString(s -> {
            // 创建一个MethodReObject对象
            MethodReObject meo = new MethodReObject();
            // 调用MethodReObject对象的成员方法printUpperCaseString，将字符串按大写输出
            meo.printUpperCaseString(s);
        });

        // 使用方法引用优化lambda，对象是已经存在的MethodReObject，成员方法也是已经存在的printUpperCaseString
        MethodReObject obj = new MethodReObject();
        printString(obj::printUpperCaseString);
    }



}
