package company;

import java.time.LocalDate;

/**
 * Project: Strategy
 * Created by SAILMA on 06.04.2017.
 */
public interface InvoiceHeader {

    LocalDate getBillDate();
    int getBillNo();
    Receiver getBillRec();
    String toString();

}
