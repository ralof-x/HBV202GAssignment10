package is.hi.hbv202g.ass9.compositeLeafObservedTemplateMethod;


public class PlusComposite extends OperationComposite {

    @Override
    public int getResult() {
        int runningTotal = 0;
        for (MathExpression child : children) {
            runningTotal += child.getResult();
        }
        return runningTotal;
    }

}