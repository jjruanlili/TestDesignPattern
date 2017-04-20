package builderFactory;

/**
 * Created by rll on 2017/4/19.
 */
public interface PersonBuilder {
    void buildHead();

    void buildBody();

    void buildFoot();

    Person buildPerson(String name, String old);
}
