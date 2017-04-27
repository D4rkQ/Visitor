package company;

/**
 * Project: Strategy
 * Created by SAILMA on 06.04.2017.
 */
class InvoiceHeaderFactory  {


    InvoiceHeader createDefaultInvoiceHeader(Receiver receiver) {
        return new InvoiceHeaderDefault(receiver);
    }

    InvoiceHeader createBackdateInvoiceHeader(Receiver receiver) {
        return new InvoiceHeaderBackdate(receiver);
    }
}
