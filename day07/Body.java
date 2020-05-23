package cn.itcast.day07;

import cn.itcast.day06.Interface_Class;

public class Body {  // 外部类

    int num = 10;
    // 成员内部类，内部类可以随意访问外部类的内容，但是外部类想要使用内部类，就要进行创建内部类对象才能使用
    public class Heart{  // 内部类

        int num = 20;
        // 内部类方法
        public void methodHeart(){
            int num = 30;
            System.out.println("局部变量" + num);
            System.out.println("内部类成员变量" + this.num);
            System.out.println("外部类成员变量" + Body.this.num);
            System.out.println("内部类方法");
        }
    }


    // 外部类方法
    public void methodBody(){
        // 外部类方法使用内部类方法的时候，需要创建内部类对象，然后进行使用
        Heart heart = new Heart();
        // 在外部类对象中使用内部类对象
        heart.methodHeart();
        System.out.println("外部类方法");
    }

    // 局部内部类创建方法，局部内部类不需要写修饰符
    public void methodOuter(){
        class Inner{
            int num = 10;
            public void methodInner(){
                System.out.println("局部内部类方法");
            }
        }

        Inner inner = new Inner();
        inner.methodInner();
    }
}
