package colecoes;

import java.util.HashMap;
import java.util.Map;

public class DicionarioCaracteres {
    Map<Character, Integer> dicionario;

    public DicionarioCaracteres(){
        dicionario = new HashMap<>();
    }

    public String charOcorrenciasToString(String word){
        charOcorrencias(word);
        String retorno = "";

        for(Character c : word.toCharArray()){
            String aux = c + dicionario.get(c).toString();
            retorno = retorno.concat("," + aux);
        }

        return retorno;

    }
    
    
    
    public void charOcorrencias(String word){

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
