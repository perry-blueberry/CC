package src.Absyn; // Java Package generated by the BNF Converter.

import src.TypeException;

public abstract class Expr implements java.io.Serializable {
  public abstract <R,A> R accept(Expr.Visitor<R,A> v, A arg) throws TypeException, src.TypeException;
  public interface Visitor <R,A> {
    public R visit(src.Absyn.EVar p, A arg) throws TypeException;
    public R visit(src.Absyn.ELitInt p, A arg);
    public R visit(src.Absyn.ELitDoub p, A arg);
    public R visit(src.Absyn.ELitTrue p, A arg);
    public R visit(src.Absyn.ELitFalse p, A arg);
    public R visit(src.Absyn.EApp p, A arg) throws TypeException;
    public R visit(src.Absyn.EString p, A arg);
    public R visit(src.Absyn.Neg p, A arg) throws TypeException;
    public R visit(src.Absyn.Not p, A arg) throws TypeException;
    public R visit(src.Absyn.EMul p, A arg) throws TypeException;
    public R visit(src.Absyn.EAdd p, A arg) throws TypeException;
    public R visit(src.Absyn.ERel p, A arg) throws TypeException;
    public R visit(src.Absyn.EAnd p, A arg) throws TypeException;
    public R visit(src.Absyn.EOr p, A arg) throws TypeException;

  }

}