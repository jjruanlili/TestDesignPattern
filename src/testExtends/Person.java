package testExtends;

/**
 * 关于继承的执行顺序
 * Created by rll on 2017/4/28.
 */
public class Person {
    String name;
    int age;

    {
        System.out.println("父类的非静态代码块");
    }

    static{
        System.out.println("父类的static代码块");
    }

    Person(){
        System.out.println("父类的无参构造函数");
    }

    Person(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("父类的有参构造函数");
    }

    void eat(){
        System.out.println("父类的吃饭");
    }
    public static void main(String[] args){

        System.out.println("父类主方法");
        Person p = new Person();
        p.eat();
    }
}
