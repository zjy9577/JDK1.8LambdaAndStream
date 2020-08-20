package cn.zhouzhou.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamMatch {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5);
        //如果有一个元素不匹配就为false
        boolean b=list.stream().allMatch((s)->{return s>3;});
        System.out.println(b);
        System.out.println("=========================");
        //如果有一个元素匹配就返回true
        boolean b2=list.stream().anyMatch((s)->{return s>3;});
        System.out.println(b2);
        System.out.println("=========================");
        //如果没有元素匹配就返回true
        boolean b3=list.stream().anyMatch((s)->{return s>0;});
        System.out.println(b3);
    }
}
