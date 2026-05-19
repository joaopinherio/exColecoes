package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class DicionarioCaracteres {
    Map<Character, Integer> dicionario;

    public DicionarioCaracteres(){
        dicionario = new HashMap<>();
    }

    public void charOcorrencias(String word){
        Set<Character> auxSet = new HashSet();

        for(Character c : word.toCharArray()){
            if(dicionario.containsKey(c)){
                Integer oldValue = dicionario.get(c);
                dicionario.put(c, oldValue+1);
            }else{
                dicionario.put(c, 1);
            }
        }
    }

    public void printMap(){
        System.out.println(dicionario);
    }

}
