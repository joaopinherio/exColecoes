package colecoes;

import java.util.LinkedList;

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

    public String stringOnlyConsonants(String word){
        onlyConsonants(word);
        String retorno = "";

        Object[] aFila = fila.toArray();
        for(Object o : aFila){
            String cat = o.toString();
            retorno = retorno.concat(cat);
        }
        return retorno; 
    }

}
