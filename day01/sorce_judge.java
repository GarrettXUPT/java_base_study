package cn.itcast.day01;

public class sorce_judge {
    public static void main(String[] args) {
        int score = 90;

        if(score < 0 || score > 100){
            System.out.println("你输入的成绩是错误的");
        }else if(score >= 90 && score <= 100){
            System.out.println("优秀");
        }
        else if (score >= 80 && score < 90){
            System.out.println("良好");
        }else if (score >= 70 && score < 80){
            System.out.println("中等");
        }else if (score >= 60 && score < 70){
            System.out.println("及格");
        }else {
            System.out.println("不及格");
        }
    }
}
