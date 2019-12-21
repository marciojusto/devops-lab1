package vetores;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VetoresTest {

    String[] vetor = {"Texto 1", "Texto 2"};
    Vetores v = new Vetores();

    @Test
    public void deveRetornarElementoDeAcordoComIndice() {
        int i = 0;
        for(String elemento : vetor) {
            Assertions.assertEquals(elemento, v.retornaElemento(vetor, i));
            i++;
        }
    }

    @Test
    public void deveLancarExcecaoParaArrayNulo() {

    }
}
