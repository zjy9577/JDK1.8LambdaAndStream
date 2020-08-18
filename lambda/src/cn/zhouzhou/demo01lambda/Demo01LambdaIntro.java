package cn.zhouzhou.demo01lambda;

public class Demo01LambdaIntro {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("新线程执行代码啦！");
            }
        }).start();

        new Thread(()->{
            System.out.println("lambda表达式的新线程执行代码啦~");
        }).start();
    }
}
