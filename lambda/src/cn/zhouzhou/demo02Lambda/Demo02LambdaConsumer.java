package cn.zhouzhou.demo02Lambda;

import java.util.function.Consumer;

public class Demo02LambdaConsumer {
    public static void main(String[] args) {
        System.out.println("开始啦");
        goConsumer((String s)->{
            System.out.println(s.toUpperCase());
        });
    }
    public static void goConsumer(Consumer<String> consumer){
        System.out.println("aaa");
        consumer.accept("hello word");
    }
}
