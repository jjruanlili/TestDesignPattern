package methodFactory;

/**
 * Created by rll on 2017/4/17.
 */
public class Test {
    public static void main(String[] args) {
        MethodFactory factory = new BMWFactory();
        Car bmw = factory.makeCar();
        bmw.getName();
        factory = new BenzFactory();
        Car benz = factory.makeCar();
        benz.getName();
        //进阶 反射方法获取工厂 造车
    }
}
