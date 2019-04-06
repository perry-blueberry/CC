package src.Absyn; // Java Package generated by the BNF Converter.

public class ELitInt extends Expr {
  public final Integer integer_;
  public ELitInt(Integer p1) { integer_ = p1; }

  public <R,A> R accept(src.Absyn.Expr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof src.Absyn.ELitInt) {
      src.Absyn.ELitInt x = (src.Absyn.ELitInt)o;
      return this.integer_.equals(x.integer_);
    }
    return false;
  }

  public int hashCode() {
    return this.integer_.hashCode();
  }


}
