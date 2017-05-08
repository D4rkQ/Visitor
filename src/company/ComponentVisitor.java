package company;

/**
 * Created by SAILMA on 27.04.2017.
 */
public interface ComponentVisitor {

    void visitArticle(Article article);
    void visitInvoice(Invoice invoice);
    void visitJournal(Journal journal);
    void visitLineItem(LineItem lineItem);

}
