/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracao;

/**
 *
 * @author aluno
 */
public abstract class AbstractElement {
    
    public abstract void accept(IVisitor visitor);
    
}
