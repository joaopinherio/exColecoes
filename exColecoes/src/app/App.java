//package app;

import java.util.Stack;
import colecoes.*;

public class App {
    PilhaCaracteres pilha;
    FilaCaracteres fila;
    ConjuntoCaracteres conjunto;
    DicionarioCaracteres dicionario;

    public App() {
        pilha = new PilhaCaracteres();
        fila = new FilaCaracteres();
        conjunto = new ConjuntoCaracteres();
        dicionario = new DicionarioCaracteres();
    }

    public void executar() {
        String palavra = "Teste";

        ex1(palavra);

        ex2(palavra);

        ex3(palavra);

        ex4(palavra);

    }

    public void ex1(String palavra) {
        pilha.reverseString(palavra);

        System.out.println("Palavra ao Contrario:");
        pilha.printStack();
        System.out.println();
    }

    public void ex2(String palavra) {
        fila.onlyConsonants(palavra);

        System.out.println("Sem vogais:");
        fila.printQueue();

        System.out.println();
    }

    public void ex3(String palavra) {
        System.out.println("Sem repeticoes:");

        conjunto.addOneTime(palavra);
        System.out.println();

        conjunto.printSet();

        System.out.println();
    }

    public void ex4(String palavra){
        System.out.println("Letra/Ocorrencias");
        
        dicionario.charOcorrencias(palavra);

        System.out.println();
        
        dicionario.printMap();
    }

}
