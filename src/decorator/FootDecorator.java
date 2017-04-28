package decorator;

/**
 * Created by rll on 2017/4/28.
 */
public class FootDecorator extends Decorator {
    public FootDecorator(Invoice t) {
        super(t);
    }
    public void printInvoice() {
        ticket.printInvoice();
        System.out.println("this is the footnote of the invoice");
    }
}
