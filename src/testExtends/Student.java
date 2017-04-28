package testExtends;

/**
 * 关于继承的执行顺序
 * Created by rll on 2017/4/28.
 */
public class Student extends Person{
    int grade;

    {
        System.out.println("子类的非静态代码块");
    }

    static{
        System.out.println("子类的static代码块");
    }

    Student(){
//        super();
        System.out.println("子类的无参构造函数");
    }

    Student(String name,int age){
//        super(name,age);
        System.out.println("子类的有参构造函数："+name+","+age);
    }

    Student(String name,int age,int grade){

        this.grade=grade;
        System.out.println("子类的有参构造函数："+name+","+age+","+grade);
    }
//    @Override
    void eat(){
//        super.eat();
        System.out.println("子类的吃饭");
    }
    public static void main(String[] args){

        System.out.println("子类主方法");
        System.out.println("------------1-------------");
        Student s1 = new Student();
        System.out.println("------------2-------------");
        Student s2 = new Student("霸王谷",20,120);
        System.out.println("------------3-------------");
        Person s3 = new Student();
        System.out.println("------------4-------------");
        Student s4 = new Student("意识流",99);
        System.out.println("------------5-------------");
        Person s5 = new Student("我来卖萌的",22);
        System.out.println("--------------------------");
        s1.eat();
        s2.eat();
        s3.eat();
        s4.eat();
        s5.eat();
    }
}
