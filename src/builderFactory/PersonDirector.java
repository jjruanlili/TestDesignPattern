package builderFactory;

/**
 * Created by rll on 2017/4/19.
 */
public class PersonDirector {
    public Person makePerson(PersonBuilder pb, String name, String old) {
        pb.buildHead();
        pb.buildBody();
        pb.buildFoot();
        return pb.buildPerson(name, old);
    }
}
