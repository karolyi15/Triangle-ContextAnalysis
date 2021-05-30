package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 * Single case sequence's AST node.
 * @author Luis Mariano Ramirez Segura (@github marianosegura) 
 */
public class CaseSequenceSingle extends CaseSequence {
    
    /**
     * AST constructor.
     * @param caseAST Case AST node
     * @param pos Code line position inside source file
     */
    public CaseSequenceSingle (Case caseAST, SourcePosition pos) {
        super(pos);
        this.caseAST = caseAST;
    }

    
    /**
     * Implementation of AST visit method, calls the visitor method for this class.
     * @param v Visitor entity
     * @param o Generic object used by the caller
     * @return Result of calling the visitor method for this class
     */
    public Object visit(Visitor v, Object o) {
        return v.visitCaseSequenceSingle(this, o);
    }
    
    
    /* CaseAST node */
    public Case caseAST;
}

