import java.util.Stack;
import colecoes.*;

public class App {
    public static void main(String[] args) throws Exception {
        PilhaCaracteres pilha = new PilhaCaracteres();

        String palavra = "Teste";

        pilha.reverseString(palavra);

        System.out.println("reverse:");
        pilha.printStack();
        
    }

}
