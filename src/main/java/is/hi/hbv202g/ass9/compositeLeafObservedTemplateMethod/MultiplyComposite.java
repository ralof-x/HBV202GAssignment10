package is.hi.hbv202g.ass9.compositeLeafObservedTemplateMethod;



public class MultiplyComposite extends OperationComposite {
    @Override
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
}