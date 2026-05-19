//package app;

import java.util.Stack;
import colecoes.*;

public class App {
    PilhaCaracteres pilha;
    FilaCaracteres fila;
    ConjuntoCaracteres conjunto;

    public App(){
        pilha = new PilhaCaracteres();
        fila = new FilaCaracteres();
        conjunto = new ConjuntoCaracteres();
    }
    
    public void executar(){
        ex1();

        ex2();

        ex3();
            
    }
    
    
    public void ex1(){
        String palavra = "Teste";
        
        pilha.reverseString(palavra);
        
        System.out.println("reverse:");
        pilha.printStack();
        System.out.println();
    }


    public void ex2(){
        String palavra = "Teste";
        
        fila.onlyConsonants(palavra);
        
        System.out.println("sem vogais:");
        fila.printQueue();

        System.out.println();
    }

    public void ex3(){
        String palavra = "Teste";
        
        
        System.out.println("sem repeticoes:");
        
        conjunto.addOneTime(palavra);
        System.out.println();
        
        conjunto.printSet();

        System.out.println();
    }

}
