package cn.itcast.day11;

import java.util.Objects;

public class Objects_Judge {

    public static void main(String[] args) {
        method(null);
    }

    public static void method(Object obj){
//        if(obj == null){
//            throw new NullPointerException("传递对象的值为空");
//        }
//        Objects.requireNonNull(obj);  // 即可对对象进行合法性判断，若为空，也会抛出空指针异常
        Objects.requireNonNull(obj, "传递对象的值为空");
    }
}
