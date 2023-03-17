package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;

import java.util.ArrayList;
import java.util.List;

public class MultiplyComposite implements MathExpression {
    private List<MathExpression> children = new ArrayList<>();


    public int getResult() {
        int product = 0;
        if (!children.isEmpty()) {
            product = 1;
            for (MathExpression e : children) {
                product *= e.getResult();
            }
        }
        return product;
    }

    public void add(MathExpression expression) {
        children.add(expression);
    }

    public void remove(MathExpression expression) {
        children.remove(expression);
    }

    public List<MathExpression> getChildren() {
        return children;
    }
}
