package vetores;

public class Vetores {

    public String retornaElemento(String[] a, int n) {
        if (a == null) {
            throw new RuntimeException("Array Nulo!");
        }
        if (a.length == 0) {
            throw new RuntimeException("Array Vazio!");
        }
        if(n < 0 || n >= a.length) {
            throw new RuntimeException("Fora do domínio!");
        }
        return a[n];
    }
}
