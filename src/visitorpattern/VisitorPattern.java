package visitorpattern;

import abstracao.IElement;
import abstracao.IVisitor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Emerson
 */
public class VisitorPattern {
    
    private static List<IVisitor> visitors = new ArrayList<>();
    
    private static List<IElement> elements = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        VisitorAlturaMedia visitorAlturaMedia = new VisitorAlturaMedia();
        VisitorScoreMedio visitorScoreMedio = new VisitorScoreMedio();
        
        visitors.add(visitorAlturaMedia);
        
        visitors.add(visitorScoreMedio);
        
        
        elements.add(new Aluno(7.5, 1.85));
        elements.add(new Professor(1.73, 39));
        elements.add(new Aluno(5.0, 2.85));
        elements.add(new Professor(1.65, 2));
        elements.add(new Aluno(9.5, 2.0));
        elements.add(new Aluno(10.0, 1.45));
        elements.add(new Professor(1.50, 98));
        elements.add(new Palestrante(580.00, 1.50));
        elements.add(new Palestrante(2580.00, 2.15));
        elements.add(new Palestrante(360.00, 1.87));
        
        visitar();
        
        System.out.println("Altura média: " + visitorAlturaMedia.calculaAlturaMedia());
        System.out.println("Score médio: " + visitorScoreMedio.calculaScoreMedio());
    }
    
    private static void visitar() {
        for (IVisitor visitor : visitors) {
            for (IElement element : elements) {
                element.accept(visitor);
            }
        }
    }
    
}
