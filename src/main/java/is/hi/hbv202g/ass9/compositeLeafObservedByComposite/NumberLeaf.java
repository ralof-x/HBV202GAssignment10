package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;

public class NumberLeaf implements MathExpression {
    private int number;

    public NumberLeaf(int number) {
        this.number = number;
    }

    public int getResult() {
        return number;
    }
}
