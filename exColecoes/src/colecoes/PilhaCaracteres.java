package colecoes;

import java.util.Stack;

public class PilhaCaracteres {
    Stack<Character> pilha;
    
    public PilhaCaracteres(){
        pilha = new Stack<>();
    }

    public void reverseString(String word){
        for(int i = 0; i < word.length(); i++){
            pilha.push(word.charAt(i));
        } 
    }

    public void printStack(){
        while(!(pilha.isEmpty())){
            System.out.print(pilha.pop());
        }
    }


}
