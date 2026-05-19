package colecoes;

import java.util.Collection;
import java.util.Queue;

public class FilaCaracteres implements Collection{
    Queue<Character> fila;

    public FilaCaracteres(){
        fila = new Queue <>();
    }

    public void onlyConsonants(String word){
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) != 'a' || word.charAt(i) != 'e' || word.charAt(i) != 'i' || word.charAt(i) != 'o' || word.charAt(i) != 'u'){
                fila.offer(word.charAt(i));
            }
        }
    }

}
