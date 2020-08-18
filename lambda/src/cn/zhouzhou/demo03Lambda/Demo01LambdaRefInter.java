package cn.zhouzhou.demo03Lambda;

import java.util.function.Consumer;

public class Demo01LambdaRefInter {
    //求一个数组的和
    public static void getMax(int []arr){
        int sum=0;
        for(int n:arr){
            sum+=n;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        printMax(Demo01LambdaRefInter::getMax);
    }

    public static void printMax(Consumer<int[]> consumer){
        int []arr={11,22,33,44,55};
        consumer.accept(arr);
    }
}
