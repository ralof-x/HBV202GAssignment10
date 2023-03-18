package is.hi.hbv202g.ass9.composite;

import is.hi.hbv202g.ass9.compositeLeafObservedTemplateMethod.OperationComposite;
import java.util.List;
import java.util.ArrayList;
public class PlusComposite extends OperationComposite {
    private List<MathExpression> children =new ArrayList<MathExpression>();
    public int getResult() {
        int runningTotal = 0;
        for (MathExpression child : children) {
            runningTotal += child.getResult();
        }
        return runningTotal;
    }
}


