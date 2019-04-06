package src.Absyn; // Java Package generated by the BNF Converter.

public class Plus extends AddOp {
  public Plus() { }

  public <R,A> R accept(src.Absyn.AddOp.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof src.Absyn.Plus) {
      return true;
    }
    return false;
  }

  public int hashCode() {
    return 37;
  }


}