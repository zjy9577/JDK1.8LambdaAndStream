package cn.zhouzhou.demo02Lambda;

import java.util.function.Function;

public class Demo03LambdaFunction {
    public static void main(String[] args) {
        goFunction((s)->{
            return Integer.parseInt(s);
        },(i)->{
            return i*30;
        });
    }

    public static void goFunction(Function<String,Integer> function,Function<Integer,Integer> function2){
        int num=function.apply("5");
        int result=function2.apply(num);
        System.out.println(result);
    }
}
