package src.Absyn; // Java Package generated by the BNF Converter.

import src.TypeException;

public class Incr extends Stmt {
  public final String ident_;
  public Incr(String p1) { ident_ = p1; }

  public <R,A> R accept(src.Absyn.Stmt.Visitor<R,A> v, A arg) throws TypeException { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof src.Absyn.Incr) {
      src.Absyn.Incr x = (src.Absyn.Incr)o;
      return this.ident_.equals(x.ident_);
    }
    return false;
  }

  public int hashCode() {
    return this.ident_.hashCode();
  }


}
