package builderFactory;

/**
 * Created by rll on 2017/4/19.
 */
public class Test {
    public static void main(String[] args) {
        PersonDirector pd = new PersonDirector();
        Person man = pd.makePerson(new ManBuilder(), "张三", "12");
        Person woman = pd.makePerson(new WomanBuilder(), "王五", "14");
    }
}
