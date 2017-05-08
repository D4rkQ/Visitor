package company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SAILMA on 19.04.2017. d
 */
public class Journal extends ContainsComponentList implements Component {

    private List<Invoice> listOfInvoices = new ArrayList<>();

    public Journal(List<? extends Invoice> listOfInvoices) {
        super(listOfInvoices);
        this.listOfInvoices.addAll(listOfInvoices);
    }

    public List<Invoice> getListOfInvoices() {
        return listOfInvoices;
    }

    public void setListOfInvoices(List<Invoice> listOfInvoices) {
        this.listOfInvoices = listOfInvoices;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "listOfInvoices=" + listOfInvoices +
                '}';
    }

    @Override
    public void accept(ComponentVisitor visitor) {
        visitor.visitJournal(this);
    }
}
