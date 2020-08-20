package cn.zhouzhou.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LimitAndSkip {
    public static void main(String[] args) {
       limit();
        System.out.println("========================");
       skip();
    }

    public static void limit(){
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌","周芷若","赵敏","张强","张三丰");

        list.stream().limit(3).forEach((s)-> System.out.println(s));
    }

    public static void skip(){
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌","周芷若","赵敏","张强","张三丰");
        list.stream().skip(2).forEach((s)-> System.out.println(s));
    }
}
