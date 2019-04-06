package src.Absyn; // Java Package generated by the BNF Converter.

import src.TypeException;

public class Cond extends Stmt {
  public final Expr expr_;
  public final Stmt stmt_;
  public Cond(Expr p1, Stmt p2) { expr_ = p1; stmt_ = p2; }

  public <R,A> R accept(src.Absyn.Stmt.Visitor<R,A> v, A arg) throws TypeException { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof src.Absyn.Cond) {
      src.Absyn.Cond x = (src.Absyn.Cond)o;
      return this.expr_.equals(x.expr_) && this.stmt_.equals(x.stmt_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.expr_.hashCode())+this.stmt_.hashCode();
  }


}