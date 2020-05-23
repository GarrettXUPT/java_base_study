package cn.itcast.day05;

public class My_Array {
    public static void main(String[] args) {
        Person[] person = new Person[3];

        Person one = new Person("Walker",18);
        Person two = new Person("Garrett", 19);
        Person three = new Person("Jaccika", 22);

        person[0] = one;
        person[1] = two;
        person[2] = three;

        System.out.println(person[0].getName());

    }
}
