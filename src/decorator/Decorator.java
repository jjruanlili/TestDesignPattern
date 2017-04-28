package decorator;

/**
 * Created by rll on 2017/4/28.
 */
public class Decorator extends Invoice {
    protected Invoice ticket;

    public Decorator(Invoice t) {
        ticket = t;
    }
    public void printInvoice() {
        if (ticket != null) {
            ticket.printInvoice();
        }
    }
}
