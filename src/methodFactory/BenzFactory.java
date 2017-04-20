package methodFactory;

/**
 * Created by rll on 2017/4/17.
 */
public class BenzFactory implements MethodFactory {
    @Override
    public Car makeCar() {
        return new Benz();
    }
}
