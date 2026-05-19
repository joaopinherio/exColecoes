package colecoes;
import java.util.HashSet;
import java.util.Set;


public class ConjuntoCaracteres {
    Set<Character> conjunto;

    public ConjuntoCaracteres(){
        conjunto = new HashSet<>();
    }

    //eh inerente a classe HashSet so adcionar uma vez x elemento
    public void addOneTime(String word){
        for(int i = 0; i < word.length(); i++){
            if(conjunto.add(word.charAt(i))){
                //utilizo a natureza da classe e o metodo boolean add para validar se x elemento ja foi adcionado no conjunto
                System.out.print(word.charAt(i));
            }
        }
    }

    public void printSet(){
        System.out.println(conjunto);
    }

}
