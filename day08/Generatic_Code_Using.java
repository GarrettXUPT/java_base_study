package cn.itcast.day08;

public class Generatic_Code_Using {
    public static void main01(String[] args) {
        // 不写泛型，默认为Object类型
        Generatic_Code gc = new Generatic_Code();
        gc.setName("只能是字符串");

        // 创建泛型类对象，泛型使用Integer
        Generatic_Code<Integer> objectGeneratic_code = new Generatic_Code<>();
        objectGeneratic_code.setName(1);
        Integer name = objectGeneratic_code.getName();
        System.out.println(name);
        objectGeneratic_code.method(12);

        // 创建泛型类对象，泛型使用String
        Generatic_Code<String> objectGeneratic_code1 = new Generatic_Code<>();
        objectGeneratic_code1.setName("Walker");
        String str = objectGeneratic_code1.getName();
        System.out.println(str);

    }

    public static void main(String[] args) {
        // 使用带有泛型的方法
        method01("123");
        method01(456);
    }

    // 定义一个含有泛型的方法
    private static <M> void method01(M  m){
        System.out.println(m);
    }
}
