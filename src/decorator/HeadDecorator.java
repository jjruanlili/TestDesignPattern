package decorator;

/**
 * Created by rll on 2017/4/28.
 */
public class HeadDecorator extends Decorator {
    public HeadDecorator(Invoice t) {
        super(t);
    }
    public void printInvoice(){
        System.out.println("this is the header of the invoice");
        ticket.printInvoice();
    }
}
