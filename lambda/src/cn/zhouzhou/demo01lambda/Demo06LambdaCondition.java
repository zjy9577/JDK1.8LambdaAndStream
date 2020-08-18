package cn.zhouzhou.demo01lambda;

public class Demo06LambdaCondition {
    public static void main(String[] args) {
        Flyable flyable=() ->{
            System.out.println("我会飞");
        };
    }
}
@FunctionalInterface
interface Flyable{
    public abstract void test();

}
