package cn.itcast.day12.生产者消费者模型;

/*
* 资源类：包子类
        设置包子的属性：皮，馅
        报纸的状态：有 true 没有 false
* */

public class BaoZi_Class {
    // 皮
    String pi;
    // 馅
    String xian;
    // 报纸的状态，初始值为false，表示没有包子,若为true，则表示还有包子，包子铺就进入等待状态
    boolean flag = false;
}
