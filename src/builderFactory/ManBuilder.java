package builderFactory;

/**
 * Created by rll on 2017/4/19.
 */
public class ManBuilder implements PersonBuilder {
    @Override
    public void buildHead() {
        System.out.println("造男人头");
    }

    @Override
    public void buildBody() {
        System.out.println("造男人身体");
    }

    @Override
    public void buildFoot() {
        System.out.println("造男人脚");
    }

    @Override
    public Person buildPerson(String name, String old) {
        return new Man(name, old);
    }
}
