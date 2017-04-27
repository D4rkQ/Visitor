package company;

/**
 * Project: Strategy
 * Created by SAILMA on 06.04.2017.
 */
public interface TaxStrategy {

    Money calcTax(Invoice invoice);

}
