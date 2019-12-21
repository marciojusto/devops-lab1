package vetores;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class VetoresTest {

    String[] vetor = {"Texto 1", "Texto 2"};
    Vetores v = new Vetores();

    @Test
    public void deveRetornarElementoDeAcordoComIndice() {
        var i = 0;
        for (var elemento : vetor) {
            Assertions.assertEquals(elemento, v.retornaElemento(vetor, i));
            i++;
        }
    }

    @Test
    public void deveLancarExcecaoParaArrayNulo() {
        Exception e = Assertions.assertThrows(RuntimeException.class,
                () -> v.retornaElemento(null, 0));
        assertTrue(e.getMessage().contentEquals("Array Nulo!"));
    }

    @Test
    public void deveLancarExecaoParaArrayVazio() {
        String[] vetorVazio = {};
        Exception e = Assertions.assertThrows(RuntimeException.class,
                () -> v.retornaElemento(vetorVazio, 0));
        assertTrue(e.getMessage().contentEquals("Array Vazio!"));
    }

    @Test
    public void deveLancarExecaoParaIndiceNegativo() {
        Exception e = Assertions.assertThrows(RuntimeException.class,
                () -> v.retornaElemento(vetor, -1));
        assertTrue(e.getMessage().contentEquals("Fora do domínio!"));
    }

    @Test
    public void deveLancarExecaoParaIndiceMaiorQueArray() {
        Exception e = Assertions.assertThrows(RuntimeException.class,
                () -> v.retornaElemento(vetor, 3000));
        assertTrue(e.getMessage().contentEquals("Fora do domínio!"));
    }
}
