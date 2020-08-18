package cn.zhouzhou.demo01lambda;

public class Demo02LambdaUse {
    public static void main(String[] args) {
        //无参数的lambda
        goSwimming(new Swimmable() {
            @Override
            public void swimming() {
                System.out.println("我是匿名内部类的游泳");
            }
        });
        goSwimming(()->{
            System.out.println("我是lambda表达式的游泳");
        });

        System.out.println("---------------");

        //有参数的lambda

        goParSwimming(new ParSwimmable() {
            @Override
            public int swimming(String name) {
                System.out.println("游泳的时候抽了"+name);
                return 5;
            }
        });

        goParSwimming((String name)->{
            System.out.println("游泳的时候抽了"+name);
            return 6;
        });

    }
    public static void goSwimming(Swimmable swimmable){
        swimmable.swimming();
    }
    public static void goParSwimming(ParSwimmable parSwimmable){
        int i=parSwimmable.swimming("中华");
        System.out.println("返回了"+i);
    }
}
