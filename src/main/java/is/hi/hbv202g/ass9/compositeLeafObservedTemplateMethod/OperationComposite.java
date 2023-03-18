package is.hi.hbv202g.ass9.compositeLeafObservedTemplateMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class OperationComposite implements MathExpression, Observer {
  protected List<MathExpression> children = new ArrayList<MathExpression>();
  protected int lastObservedResult;

  public abstract int getResult();

  public void add(MathExpression child) {
    children.add(child);
  }

  public void remove(MathExpression child) {
    children.remove(child);
  }

  public List<MathExpression> getChildren() {
    return children;
  }

  @Override
  public void update() {
    lastObservedResult = getResult();
    System.out.println(lastObservedResult);
  }

  public int getLastObservedResult() {
    return lastObservedResult;
  }
}
