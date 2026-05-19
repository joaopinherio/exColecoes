package colecoes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class DicionarioCaracteres {
    Map<Character, Integer> dicionario;

    public DicionarioCaracteres() {
        dicionario = new HashMap<>();
    }

    public String charOcorrenciasToString(String word) {
        HashSet<Character> aux = new HashSet<>();
        charOcorrencias(word);
        String retorno = "";

        for (Character c : word.toCharArray()) {
            if (!(aux.contains(c))) {
                String cat = c + ";" + dicionario.get(c).toString() + ";";
                retorno = retorno.concat(cat);
                aux.add(c);
            }
        }

        return retorno;

    }

    public void charOcorrencias(String word) {

        for (Character c : word.toCharArray()) {
            if (dicionario.containsKey(c)) {
                Integer oldValue = dicionario.get(c);
                dicionario.put(c, oldValue + 1);
            } else {
                dicionario.put(c, 1);
            }
        }
    }

    public void printMap() {
        System.out.println(dicionario);
    }

}
