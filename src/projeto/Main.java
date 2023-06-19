package projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import modelo.Produto;
import util.ProdutoPredicado;

public class Main {

    public static void main(String[] args) {

        List<Produto> lista = new ArrayList<>();

        lista.add(new Produto("Tv", 900.00));
        lista.add(new Produto("Mouse", 50.00));
        lista.add(new Produto("Tablet", 350.50));
        lista.add(new Produto("HD Case", 80.90));
        
        double min = 100.0;
        
       // Predicate<Produto> pred = p-> p.getPreco() >= min;

        lista.removeIf(p-> p.getPreco() >= min);

        for (Produto p : lista) {
            System.out.println(p);
        }

    }

}
