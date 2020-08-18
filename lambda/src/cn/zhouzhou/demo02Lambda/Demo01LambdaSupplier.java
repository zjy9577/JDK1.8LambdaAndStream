package cn.zhouzhou.demo02Lambda;

import java.util.function.Supplier;

public class Demo01LambdaSupplier {
    public static void main(String[] args) {
        System.out.println(goSupplier(()->{
            return 5;
        }));
    }

    public static Integer goSupplier(Supplier<Integer> supplier){
        return supplier.get();
    }
}

