
package util;

import java.util.function.Predicate;
import modelo.Produto;


public class ProdutoPredicado implements Predicate<Produto> {

    
    @Override
    public boolean test(Produto p) {
        
        return p.getPreco() >= 100.0;
    }
    
}
