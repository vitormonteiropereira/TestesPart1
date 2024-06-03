import org.example.Lista;
import org.example.Pessoa;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class Teste {

    @Test
    public void testListaFeminina() {
        Lista lista = new Lista();
        lista.add(new Pessoa("Ana", "F"));
        lista.add(new Pessoa("Maria", "F"));
        lista.add(new Pessoa("João", "M"));
        lista.add(new Pessoa("Pedro", "M"));

        List<Pessoa> listaFeminina = lista.getList().stream()
                .filter(pessoa -> pessoa.getSexo().equals("F"))
                .collect(Collectors.toList());

        for (Pessoa pessoa : listaFeminina) {
            assertEquals("F", pessoa.getSexo());
        }
    }
}