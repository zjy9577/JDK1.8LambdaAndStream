package cn.zhouzhou.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamMap {
    public static void main(String[] args) {
        map();
    }

    public static void map(){
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"1","2","3","4","5");
        list.stream().map((s)->Integer.parseInt(s)).forEach((s)-> System.out.println(s));

    }
}
