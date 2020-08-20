package cn.zhouzhou.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamDistinct {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"1","2","3","3","5");
        list.stream().distinct().forEach(System.out::println);
    }
}
