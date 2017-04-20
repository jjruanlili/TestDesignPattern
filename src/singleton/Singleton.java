package singleton;

/**
 * Created by rll on 2017/4/18.
 */
public class Singleton {
    /*//饿汉模式 线程安全 但效率比较低
    //定义一个私有的构造方法
    private Singleton(){}
    // 将自身的实例对象设置为一个属性,并加上Static和final修饰符
    private static final  Singleton instance = new Singleton();
    // 静态方法返回该类的实例
    public static Singleton getInstance(){
        return  instance;
    }*/

/*饱汉式,非线程安全
// 定义私有构造方法（防止通过 new SingletonTest()去实例化）
    private Singleton(){}
    // 定义一个SingletonTest类型的变量（不初始化，注意这里没有使用final关键字）
    private static Singleton instance;
    // 定义一个静态的方法（调用时再初始化SingletonTest，但是多线程访问时，可能造成重复初始化问题）
    public static Singleton getInstance(){
        if(null == instance)
            instance = new Singleton();
        return instance;
    }
    //可以在getInstance方法前添加synchronized保证线程安全 但是效率偏低
    */

    //单例模式的最佳实现。内存占用低，效率高，线程安全，多线程操作原子性
    private Singleton() {
    }

    private static volatile Singleton instance;

    public static Singleton getInstance() {
        // 对象实例化时与否判断（不使用同步代码块，instance不等于null时，直接返回对象，提高运行效率）
        if (instance == null) {
            //同步代码块（对象未初始化时，使用同步代码块，保证多线程访问时对象在第一次创建后，不再重复被创建）
            synchronized (Singleton.class) {
                //未初始化，则初始instance变量
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
    //可以通过Java反射机制来实例化private类型的构造方法，此时基本上会使所有的Java单例实现失效。本帖不讨论反射情况下问题，默认无反射，也是常见的面试已经应用场景

}
