package is.hi.hbv202g.ass9.composite;

import java.util.List;
import java.util.ArrayList;
public class PlusComposite implements MathExpression{
    private List<MathExpression> leafs=new ArrayList<MathExpression>();
    public int getResult() {
        int runningTotal = 0;
        for (MathExpression child : leafs) {
            runningTotal += child.getResult();
        }
        return runningTotal;
    }
    public void add(MathExpression leaf) {
        leafs.add(leaf);
    }
    public void remove(MathExpression leaf) {
        leafs.remove(leaf);
    }
    public List<MathExpression> getLeaf() {
        return leafs;
    }
}


