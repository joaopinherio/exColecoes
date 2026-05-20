package colecoes;

import java.util.LinkedList;

public class GavetaDeJogos {
    LinkedList<String> gavetaJ;

    public GavetaDeJogos(){
        gavetaJ = new LinkedList<>();
    }


    public void empilhaJogo(String jogo){
        gavetaJ.push(jogo);
    }

    public void enterraJogo(String jogo){
        gavetaJ.offer(jogo);
    }

    public void empilhaColecao(String colecao[]){
        for (String jogo : colecao) {
            gavetaJ.push(jogo);
        }
    }

    public void enfileraJogos(String colecao[]){
        for (String jogo : colecao) {
            gavetaJ.offer(jogo);
        }
    }

    public void pegaJogoDeCima(){
        System.out.println(gavetaJ.pop());
    }

    public void pegaPrimeiroJogo(){
        System.out.println(gavetaJ.poll());
    }


    public void retiraEngavetadosPilha(){
        while(!(gavetaJ.isEmpty())){
            System.out.println(gavetaJ.pop());
        }
    }

    public void retiraEngavetadosFila(){
        while(!(gavetaJ.isEmpty())){
            System.out.println(gavetaJ.poll());
        }
    }

}



