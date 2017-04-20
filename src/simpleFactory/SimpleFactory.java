package simpleFactory;

/**
 * 简单工厂模式
 * Created by rll on 2017/4/14.
 */
public class SimpleFactory {
    public Car getCar(String carType) {
        if (carType.equals("BMW")) {
            return new BMW();
        } else if (carType.equals("Benz")) {
            return new Benz();
        }
        return null;
    }
}
