package abstracao;

/**
 *
 * @author Emerson
 */
public interface IElement {
    
    public void accept(IVisitor visitor);
    
    public Double execute();
}
