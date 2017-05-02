package visitorpattern;

import abstracao.IElement;
import abstracao.IVisitor;

/**
 *
 * @author Emerson
 */
public class Aluno implements IElement{
    
    private Double score;
    private Double altura;
    private IVisitor visitor;

    public Aluno(Double score, Double altura) {
        this.score = score;
        this.altura = altura;
    }
    
    @Override
    public void accept(IVisitor visitor) {
        this.visitor = visitor;
        visitor.visitElement(this);
    }
    
    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public Double execute() {
        if(visitor instanceof VisitorAlturaMedia)
            return this.altura;
        if(visitor instanceof VisitorScoreMedio)
            return this.score;
        
        return 0.0;
    }

}
