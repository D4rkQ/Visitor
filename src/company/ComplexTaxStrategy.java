package company;

/**
 * Project: Strategy
 * Created by SAILMA on 13.04.2017.
 */
public class ComplexTaxStrategy implements TaxStrategy {


    @Override
    public Money calcTax(Invoice invoice) {

        Money grossInvoiceValue = new Money(0);
        for (LineItem x:invoice.getLineItems()) {

            if (x.getDescription().contains("seven")) {
                grossInvoiceValue = grossInvoiceValue.add(x.sum().mult(1.07));
            } else  { //19% Tax
                grossInvoiceValue = grossInvoiceValue.add(x.sum().mult(1.19));
            }
        }

        return grossInvoiceValue;

    }
}
