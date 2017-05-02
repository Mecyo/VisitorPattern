/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitorpattern;

import abstracao.IElement;
import abstracao.IVisitor;

/**
 *
 * @author aluno
 */
public class Palestrante implements IElement{
    
    private Double valorCobrado;
    private Double altura;
    private IVisitor visitor;

    public Palestrante(Double valorCobrado, Double altura) {
        this.valorCobrado = valorCobrado;
        this.altura = altura;
    }
    
    @Override
    public void accept(IVisitor visitor) {
        this.visitor = visitor;
        visitor.visitElement(this);
    }

    @Override
    public Double execute() {
        if(visitor instanceof VisitorAlturaMedia)
            return this.altura;
        
        return 0.0;
    }
}
