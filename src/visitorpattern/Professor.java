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
 * @author Emerson
 */
public class Professor implements IElement{
    
    private Double altura;
    private Integer publicacoes;

    public Professor(Double altura, Integer publicacoes) {
        this.altura = altura;
        this.publicacoes = publicacoes;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visitProfessor(this);
    }
    
    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Integer getPublicacoes() {
        return publicacoes;
    }

    public void setPublicacoes(Integer publicacoes) {
        this.publicacoes = publicacoes;
    }
    
}
