package cn.itcast.day18.ReflectDomain;

public class AnnoDemo {

    @Override
    public String toString() {
        return super.toString();
    }

    @Deprecated
    public void show01(){
        System.out.println("该方法具有缺陷");
    }

    @SuppressWarnings("all")  // 压制所有的警告
    public void show02(){
        System.out.println("这是对show01方法的替代");
    }


    public void demo(){
        show01();  // 在调用时可以看到方法上已经划线了，说明该方法已经过时了，不建议使用了，但是可以使用
    }
}
