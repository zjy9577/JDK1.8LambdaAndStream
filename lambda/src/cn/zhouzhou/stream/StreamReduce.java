package cn.zhouzhou.stream;

import java.util.stream.Stream;

public class StreamReduce {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1, 2, 34, 55, 12);
        Integer max = integerStream.reduce(0, (x, y) -> x > y ? x : y);
        System.out.println(max);
    }
}
