package cn.zhouzhou.demo03Lambda;

import java.util.Date;
import java.util.function.Supplier;

public class Demo02 {
    public static void main(String[] args) {
        Date date=new Date();
        Supplier<Long> supplier=date::getTime;
        System.out.println(supplier.get());
    }
}
