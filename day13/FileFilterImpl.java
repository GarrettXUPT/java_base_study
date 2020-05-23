package cn.itcast.day13;


import java.io.File;
import java.io.FileFilter;

// 创建过滤器FileFilter的实现类，重写accept方法
public class FileFilterImpl implements FileFilter {

    // 若accept返回的是true，就会将传递过来的File对象保存到File数组中
    // 若返回的是false就不会将传递过来的对象保存到数组中

    // 过滤的规则：accept方法中判断File对象是否以.java结尾
    // 若pathname是一个文件夹，返回的是true则继续遍历文件夹
    @Override
    public boolean accept(File pathname) {
        if(pathname.isDirectory()){
            return true;
        }
        return pathname.getName().toLowerCase().endsWith(".java");
    }
}
