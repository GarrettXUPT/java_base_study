package cn.itcast.day18.Anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
    * @Target 描述了注解可以作用的位置
      @Retention 描述注解可以被保留的阶段
      @Documented 描述注解是否抽取到api
      @Inherited 描述注解是否被子类继承
    * */

@Target(value = {ElementType.TYPE})  // 表示MyAnno只能作用于类上
@Retention(RetentionPolicy.RUNTIME)   // 作用至RUNTIME阶段
public @interface MyAnno {


}
