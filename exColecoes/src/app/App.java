//package app;

import colecoes.*;

public class App {
    PilhaCaracteres pilha;
    FilaCaracteres fila;
    GavetaDeJogos gaveta;

    public App() {
        pilha = new PilhaCaracteres();
        fila = new FilaCaracteres();
        gaveta = new GavetaDeJogos();

    }

    public void executar() {
        /* Para comecar usamos ideias genericas/classicas de 
        programacao para exercitar primeiro o conceito de stack 
        depois o de fila, manipulando um array de char
        */
        String palavra = "Teste";
        System.out.println("Palavra original: " + palavra);

        reescreveAoContrario(palavra);
        reescreveSemVogais(palavra);

        /*Depois fizemos uma classe com LinkedList para usarmos
        as duas funcionalidades de uma maneira mais criativa,
        com jogos! Enchemos a classe de metodos que tratam a classe
        catalogo como uma gaveta que pode ser utilizada tanto como
        uma pilha ou fila de jogos */

        String[] jogos = {"1:SF 3rd Strike" , "2: DOOM", "3: FORTNITE", "4: CSGO", "5: ZELDA OCARINA OF TIME"};

        pilhaNaGaveta(jogos);
        filaNaGaveta(jogos);        

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

    public void pilhaNaGaveta(String[] jogos){
        gaveta.empilhaColecao(jogos);
        gaveta.pegaJogoDeCima();
        gaveta.empilhaJogo(jogos[jogos.length-1]);
        gaveta.retiraEngavetadosPilha();
    }
    
    public void filaNaGaveta(String[] jogos){
        gaveta.enfileraJogos(jogos);
        gaveta.pegaPrimeiroJogo();
        gaveta.enterraJogo(jogos[0]);
        gaveta.retiraEngavetadosFila();
    }

    

}
