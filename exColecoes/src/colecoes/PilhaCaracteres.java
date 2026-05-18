package colecoes;

import java.util.Stack;

public class PilhaCaracteres {
    Stack<String> pilha;
    
    public PilhaCaracteres(){
        pilha = new Stack<>();
    }

    public void reverseString(String[] a){
        for(String i : a){
            pilha.push(i);
        }
    }

    public void printStack(){
        for(String i : pilha){
            System.out.println(i);
        }
    }


}
