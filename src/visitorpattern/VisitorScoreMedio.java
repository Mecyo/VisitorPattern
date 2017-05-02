package visitorpattern;

import abstracao.IElement;
import abstracao.IVisitor;

/**
 *
 * @author Emerson
 */
public class VisitorScoreMedio implements IVisitor{
    
    private Integer qtdeVisitados = 0;
    private Double scoreAcumulado = 0.0;

    @Override
    public void visitAluno(Aluno aluno) {
        qtdeVisitados++;
        scoreAcumulado += aluno.getScore();
    }

    @Override
    public void visitProfessor(Professor professor) {
    }
    
    public Double calculaScoreMedio() {
        return scoreAcumulado / qtdeVisitados;
    }

    @Override
    public void visitElement(IElement element) {
        qtdeVisitados++;
        scoreAcumulado += element.execute();
    }
    
}
