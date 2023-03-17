package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;

import java.util.ArrayList;
import java.util.List;

public class PlusComposite implements MathExpression {
    private List<MathExpression> children = new ArrayList<MathExpression>();

    public int getResult() {
        int runningTotal = 0;
        for (MathExpression child : children) {
            runningTotal += child.getResult();
        }
        return runningTotal;
    }

    public void add(MathExpression leaf) {
        children.add(leaf);
    }

    public void remove(MathExpression leaf) {
        children.remove(leaf);
    }

    public List<MathExpression> getChildren() {
        return children;
    }
}


