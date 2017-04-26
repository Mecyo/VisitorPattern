package abstracao;

import visitorpattern.Aluno;
import visitorpattern.Professor;

/**
 *
 * @author Emerson
 */
public interface IVisitor {
    
    public void visitAluno(Aluno elementA);
    
    public void visitProfessor(Professor elementB);
    
}
