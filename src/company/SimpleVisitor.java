package company;

/**
 * Created by SAILMA on 27.04.2017.
 */
public class SimpleVisitor implements ComponentVisitor {

    @Override
    public void visitArticle(Article article) {
        System.out.println("Visiting Article with: " + article.getDescription());
    }

    @Override
    public void visitInvoice(Invoice invoice) {
        System.out.println("Visiting Invoice with: " + invoice.toString());
    }

    @Override
    public void visitJournal(Journal journal) {
        System.out.println("Visiting Journal with: " + journal.toString());
    }

    @Override
    public void visitLineItem(LineItem lineItem) {
        System.out.println("Visiting LineItem with: " + lineItem.toString());
    }
}
