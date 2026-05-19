//package app;

import java.util.Stack;
import colecoes.*;

public class App {
    PilhaCaracteres pilha;

    public App(){
        pilha = new PilhaCaracteres();
    }
    

    public void executar(){
        ex1();
            
    }
    
    
    public void ex1(){
        String palavra = "Teste";
        
        pilha.reverseString(palavra);
        
        System.out.println("reverse:");
        pilha.printStack();
    }

}
