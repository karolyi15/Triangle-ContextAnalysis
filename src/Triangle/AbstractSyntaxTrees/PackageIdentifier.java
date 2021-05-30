/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle.AbstractSyntaxTrees;
import Triangle.SyntacticAnalyzer.SourcePosition;
/**
 *
 * @author karol
 */
public abstract class PackageIdentifier extends AST{
    
    //Fields
    
    
    //Constructor
    public PackageIdentifier(SourcePosition thePosition) {
        super(thePosition);
      
    }
    
    //Visitor
}
