package colecoes;
import java.util.HashSet;
import java.util.Set;


public class ConjuntoCaracteres {
    Set<Character> conjunto;

    public ConjuntoCaracteres(){
        conjunto = new HashSet<>();
    }

    public void addOneTime(String word){
        for(int i = 0; i < word.length(); i++){
            if(conjunto.add(word.charAt(i))){
                System.out.println(word.charAt(i));
            }
        }
    }

    public void printSet(){
        System.out.println(conjunto);
    }

}
