package cn.zhouzhou.stream;

import cn.zhouzhou.demo01lambda.Person;

import java.util.stream.Stream;

public class MapAndReduce {
    public static void main(String[] args) {
        Integer result = Stream.of(
                new Person("周一", 22),
                new Person("周二", 88),
                new Person("周三", 77),
                new Person("周四", 66),
                new Person("周五", 55)
        ).map(Person::getAge).reduce(0, Integer::sum);
        System.out.println(result);
    }
}
