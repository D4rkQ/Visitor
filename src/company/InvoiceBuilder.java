package company;

import java.util.ArrayList;
import java.util.List;

/**
 * Project: Strategy
 * Created by sailerm on 31.03.2017.
 */
public class InvoiceBuilder {

    private final List<LineItem> listOfLineItems = new ArrayList<>();
    private InvoiceHeader invoiceHeader;
    private final InvoiceHeaderFactory fac = new InvoiceHeaderFactory();

    void addLineItem( LineItem lineItem ) {
        this.listOfLineItems.add( lineItem );
    }

    void clearLineItems() {
        this.listOfLineItems.clear();
    }

    Invoice createDefault(Receiver receiver) {

        invoiceHeader = fac.createDefaultInvoiceHeader(receiver);

        return new Invoice(listOfLineItems, invoiceHeader);
    }

    public Invoice createBackdate(Receiver receiver) {

        invoiceHeader = fac.createBackdateInvoiceHeader(receiver);

        return new Invoice(listOfLineItems, invoiceHeader);
    }
}
