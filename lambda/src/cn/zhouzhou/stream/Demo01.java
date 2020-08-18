package cn.zhouzhou.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Demo01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌","周芷若","赵敏","张强","张三丰");
        list.stream().filter(s->s.startsWith("张")).filter(s->s.length()==3)
        .forEach(s-> System.out.println(s));

    }
}
