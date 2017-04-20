package methodFactory;

/**
 * Created by rll on 2017/4/17.
 */
public class BMWFactory implements MethodFactory {
    @Override
    public Car makeCar() {
        return new BMW();
    }
}
