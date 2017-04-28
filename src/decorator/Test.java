package decorator;

/**
 * 装饰模式
 * Created by rll on 2017/4/28.
 */
public class Test {
    public static void main(String[] args) {
        Invoice t = new Invoice();
        Invoice ticket;
        ticket = new FootDecorator(new HeadDecorator(t));
        ticket.printInvoice();
        System.out.println("-------------");
        ticket = new FootDecorator(new HeadDecorator(new Decorator(null)));
        ticket.printInvoice();
    }
}
