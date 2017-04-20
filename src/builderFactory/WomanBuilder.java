package builderFactory;

/**
 * Created by rll on 2017/4/19.
 */
public class WomanBuilder implements PersonBuilder {
    @Override
    public void buildHead() {
        System.out.println("造女人头");
    }

    @Override
    public void buildBody() {
        System.out.println("造女人身体");
    }

    @Override
    public void buildFoot() {
        System.out.println("造女人脚");
    }

    @Override
    public Person buildPerson(String name, String old) {
        return new Woman(name, old);
    }
}
