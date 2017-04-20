package simpleFactory;

/**
 * Created by rll on 2017/4/14.
 */
public class Test {
    public static void main(String[] args) {
        SimpleFactory sf = new SimpleFactory();
        Car benz = sf.getCar("Benz");
        benz.getName();
        Car bmw = sf.getCar("BMW");
        bmw.getName();
    }
}
