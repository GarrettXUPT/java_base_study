package cn.itcast.day08;

// 使用泛型编程的代码
public class Generatic_Code<E> {
      private E name;
      // 使用泛型的方法，泛型作为返回值类型
    public E getName() {
        return name;
    }
    // 泛型作为参数
    public void setName(E name) {
        this.name = name;
    }

    public E method(E age){
        E age_tmp = age;
        System.out.println("这是一个泛型方法");
        return age_tmp;
    }
}
