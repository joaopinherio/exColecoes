package colecoes;
import java.util.HashSet;
import java.util.Set;


public class ConjuntoCaracteres {
    Set<Character> conjunto;

    public ConjuntoCaracteres(){
        conjunto = new HashSet<>();
    }

    //eh inerente a classe HashSet so adcionar uma vez x elemento
    public String addOneTime(String word){
        String retorno = "";
        for(Character c : word.toCharArray()){
            if(conjunto.add(c)){
                //utilizo a natureza da classe e o metodo boolean add para validar se x elemento ja foi adcionado no conjunto
                retorno = retorno.concat(c.toString());
            }
        }
        return retorno;
    }


}
