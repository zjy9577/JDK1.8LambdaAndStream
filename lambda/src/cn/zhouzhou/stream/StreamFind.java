package cn.zhouzhou.stream;

import java.util.stream.Stream;

public class StreamFind {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("1", "2", "3", "4", "5");
        String s = stringStream.findFirst().get();
        System.out.println(s);
    }
}
