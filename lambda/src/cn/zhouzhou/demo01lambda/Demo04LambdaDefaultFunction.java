package cn.zhouzhou.demo01lambda;

public class Demo04LambdaDefaultFunction {
    public static void main(String[] args) {
        BB b=new BB();
        b.test();

        CC c=new CC();
        c.test();
    }
}

interface AA{
    public default void test(){
        System.out.println("好好学习，坚持下去");
    }
}

class BB implements AA{

}
class CC implements AA{
    @Override
    public void test() {
        System.out.println("加油！！");
    }
}
