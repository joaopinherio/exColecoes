//package app;

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

        System.out.println("Palavra original: " + palavra);

        ex1(palavra);

        ex2(palavra);

        ex3(palavra);

        ex4(palavra);

    }

    public void ex1(String palavra) {

        System.out.print("Palavra ao Contrario: ");

        palavra = pilha.reverseToString(palavra);

        System.out.println(palavra);
    }

    public void ex2(String palavra) {
        System.out.print("Sem vogais: ");
        
        palavra = fila.stringOnlyConsonants(palavra);

        System.out.println(palavra);
    }

    public void ex3(String palavra) {
        System.out.print("Sem repeticoes: ");

        palavra = conjunto.addOneTime(palavra);

        System.out.println(palavra);
    }

    public void ex4(String palavra){
        System.out.print("Letra/Ocorrencias: ");

        palavra = dicionario.charOcorrenciasToString(palavra);

        System.out.println(palavra);
    }

}
