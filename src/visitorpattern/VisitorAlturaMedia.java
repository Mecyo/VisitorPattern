package visitorpattern;

import abstracao.IVisitor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    @Override
    public void visitElement(Object element) {
        String metodo = "getAltura";
        
        try {
            Class clazz = Class.forName(element.getClass().getName());

            //Obtenha o metodo da classe pelo nome
            Method metodoDoSeuObjeto = clazz.getMethod(metodo);

            qtdeVisitados++;
            //invoque o metodo no seu objeto. "se necessario passe um array de argumentos."
            alturaAcumulada += (Double)metodoDoSeuObjeto.invoke(element);
        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(VisitorAlturaMedia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
