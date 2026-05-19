package colecoes;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

public class FilaCaracteres{
    LinkedList<Character> fila;

    public FilaCaracteres(){
        fila = new LinkedList <>();
    }

    public void onlyConsonants(String word){
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) != 'a' && word.charAt(i) != 'e' && word.charAt(i) != 'i' && word.charAt(i) != 'o' && word.charAt(i) != 'u'){
                fila.offer(word.charAt(i));
            }
        }
    }

    public void printQueue(){
        //System.out.println(fila.toString());
        Object[] aFila = fila.toArray();
        for(Object o : aFila){
            System.out.print(o.toString());
        }

    }

}
