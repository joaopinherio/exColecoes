//package app;

import java.util.LinkedList;
import colecoes.*;

public class App {
    PilhaCaracteres pilha;
    FilaCaracteres fila;
    GavetaDeJogos gaveta;
    CodigoJacarta codigo;

    public App() {
        pilha = new PilhaCaracteres();
        fila = new FilaCaracteres();
        gaveta = new GavetaDeJogos();
        codigo = new CodigoJacarta();

    }

    public void executar() {
        /*
         * Para comecar usamos ideias genericas/classicas de
         * programacao para exercitar primeiro o conceito de stack
         * depois o de fila, manipulando um array de char
         */

        System.out.println("Exemplos genericos stack/queue:\n");

        String palavra = "Teste";
        System.out.println("Palavra original: " + palavra);

        reescreveAoContrario(palavra);
        reescreveSemVogais(palavra);

        /*
         * Depois fizemos uma classe com LinkedList para usarmos
         * as duas funcionalidades de uma maneira mais criativa,
         * com jogos! Enchemos a classe de metodos que tratam a classe
         * catalogo como uma gaveta que pode ser utilizada tanto como
         * uma pilha ou fila de jogos
         */

        String[] jogos = { "1:SF 3rd Strike", "2: DOOM", "3: FORTNITE", "4: CSGO", "5: ZELDA OCARINA OF TIME" };

        System.out.println("--------------------------------------------------------");

        System.out.println("\n Exemplo de metodos utilizando a gaveta como pilha:");
        pilhaNaGaveta(jogos);
        System.out.println("\n Exemplo de metodos utilizando a gaveta como lista:");
        filaNaGaveta(jogos);

        System.out.println("--------------------------------------------------------\n");

        /*
         * Por ultimo desenvolvemos uma classe
         * enxuta para a decodificacao do codigo dado pelo
         * enunciado do T2, para implementação do Deque, utilzamos
         * a biblioteca LinkedList que nos auxiliou com a possibilidade de ordenarmos os
         * caracteres
         * da primeira metade do deque utilizando o método "offer", o qual é elementar
         * para ordenação
         * em fila, na segunda metade do deque,
         * utilizamos o método "push" que empilha os elementos da mesma maneira que
         * ocorre em uma pilha
         * 
         * Para descobrirmos a localização do agente, anexamos ambas as ordenações
         * utilizamos a o método "addAll" que insere toda a sequência
         * de elementos no fim da lista
         */

        decodificacaoJacarta();

    }

    public void reescreveAoContrario(String palavra) {

        System.out.print("Palavra ao Contrario: ");

        palavra = pilha.reverseToString(palavra);

        System.out.println(palavra);
    }

    public void reescreveSemVogais(String palavra) {
        System.out.print("Sem vogais: ");

        palavra = fila.stringOnlyConsonants(palavra);

        System.out.println(palavra);
    }

    public void pilhaNaGaveta(String[] jogos) {
        gaveta.empilhaColecao(jogos);
        gaveta.pegaJogoDeCima();
        gaveta.empilhaJogo(jogos[jogos.length - 1]);
        gaveta.retiraEngavetadosPilha();
    }

    public void filaNaGaveta(String[] jogos) {
        gaveta.enfileraJogos(jogos);
        gaveta.pegaPrimeiroJogo();
        gaveta.enterraJogo(jogos[0]);
        gaveta.retiraEngavetadosFila();
    }

    public void decodificacaoJacarta() {
        LinkedList primeiraMetade = codigo.entradaFstHalf();

        System.out.println("Comecando do inicio: " + primeiraMetade + "\n");

        LinkedList segundaMetade = codigo.entradaSndHalf();

        System.out.println("Comecando do fim:" + segundaMetade + "\n");

        LinkedList codigoCompleto = new LinkedList<>();
        codigoCompleto.addAll(primeiraMetade);
        codigoCompleto.addAll(segundaMetade);

        System.out.println("Codigo completo: " + codigoCompleto);

        System.out.println();
    }

}
