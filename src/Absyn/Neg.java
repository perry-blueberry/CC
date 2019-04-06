package src.Absyn; // Java Package generated by the BNF Converter.

import src.TypeException;

public class Neg extends Expr {
  public final Expr expr_;
  public Neg(Expr p1) { expr_ = p1; }

  public <R,A> R accept(src.Absyn.Expr.Visitor<R,A> v, A arg) throws TypeException { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof src.Absyn.Neg) {
      src.Absyn.Neg x = (src.Absyn.Neg)o;
      return this.expr_.equals(x.expr_);
    }
    return false;
  }

  public int hashCode() {
    return this.expr_.hashCode();
  }


}