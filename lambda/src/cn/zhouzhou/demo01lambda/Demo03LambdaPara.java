package cn.zhouzhou.demo01lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo03LambdaPara {
    public static void main(String[] args) {
        List<Person> list=new ArrayList<>();
        list.add(new Person("周周",22));
        list.add(new Person("野比",2));
        list.add(new Person("张九七",18));

        /*Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });*/

        Collections.sort(list,(o1, o2) -> o1.getAge()-o2.getAge());

        for(Person person:list){
            System.out.println(person);
        }
    }
}
