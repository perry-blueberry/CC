package src.Absyn; // Java Package generated by the BNF Converter.

public class Mod extends MulOp {
  public Mod() { }

  public <R,A> R accept(src.Absyn.MulOp.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof src.Absyn.Mod) {
      return true;
    }
    return false;
  }

  public int hashCode() {
    return 37;
  }


}
