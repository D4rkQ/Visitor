package company;

/**
 * Project: Strategy
 * Created by Max on 19.03.2017.
 */
public class Money {

    private final long cent;


    Money(long cent){
        this.cent = cent;
    }

    double asDouble() {
        return cent / 100.0;
    }

    Money add(Money a) {
        return new Money(getCent() + a.getCent());
    }

    Money subtract(Money a) {
        return new Money(getCent()-a.getCent());
    }

    Money mult(double fac) {
        return new Money(Math.round(getCent()*fac));
    }

    long getCent() {
        return cent;
    }

    @Override
    public String toString() {

        String s = ""+cent;
        String euroPart, centPart;
        centPart = s.substring(s.length()-2);
        euroPart = s.substring(0,s.length()-2);
        return euroPart +","+centPart +" €";


    }
}
