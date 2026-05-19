package colecoes;

import java.util.Stack;

public class PilhaCaracteres {
    Stack<Character> pilha;
    
    public PilhaCaracteres(){
        pilha = new Stack<>();
    }

    public String reverseToString(String word){
        stringToStack(word);
        String retorno = "";
        
        while(!(pilha.isEmpty())){
            String aux = pilha.pop().toString();
            retorno = retorno.concat(aux);
        }
        return retorno;
    }

    public void stringToStack(String word){
        for(Character c : word.toCharArray()){
            pilha.push(c);
        } 
    }
    
}
