package cn.itcast.day08;
import java.util.ArrayList;
import java.util.Collection;

public class collectionMethodUsing {
    public static void main(String[] args) {
        // 创建集合对象,可以使用多态
        Collection<String> collection1 = new ArrayList<>();
        System.out.println(collection1);  //[] 打印出来不是地址，说明重写了toString方法

        // 往集合中添加元素，返回值为布尔值，也可以选择不进行接收，若写入成功则返回true
        boolean bool = collection1.add("张三");
        System.out.println(collection1);
        collection1.add("李四");
        collection1.add("王五");

        // 移除指定的元素,若存在该元素返回值为true，若不存在则返回false
        collection1.remove("张三");
        System.out.println(collection1);  // [李四, 王五]

        // 判断当前集合中是否包含指定的元素，包含返回值为true，不包含返回值为false
        boolean bool1 = collection1.contains("李四");
        System.out.println(bool1);  // true

        // 判断当前集合是否为空,若为空，则返回值为true，若不为空则返回false
        boolean bool2 = collection1.isEmpty();
        System.out.println(bool2);  // false

        // 返回集合中元素的个数
        int size = collection1.size();
        System.out.println(size);  // 2

        // 将集合变换为数组
        Object[] arr = collection1.toArray();
        for(int i = 0; i < size; i++){
            System.out.println(arr[i]);
        }

        // 清空该集合，集合还存在，只是将集合中的元素都删除了
        collection1.clear();
        System.out.println(collection1);  // []
        System.out.println(collection1.isEmpty());  // true
    }
}
