package visitorpattern;

import abstracao.IVisitor;

/**
 *
 * @author Emerson
 */
public class VisitorAlturaMedia implements IVisitor{
    
    private Integer qtdeVisitados = 0;
    private Double alturaAcumulada = 0.0;

    @Override
    public void visitAluno(Aluno aluno) {
        qtdeVisitados++;
        alturaAcumulada += aluno.getAltura();
    }

    @Override
    public void visitProfessor(Professor professor) {
        qtdeVisitados++;
        alturaAcumulada += professor.getAltura();
    }
    
    public Double calculaAlturaMedia() {
        return alturaAcumulada / qtdeVisitados;
    }
    
}
