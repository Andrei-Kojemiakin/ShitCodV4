package Start;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        System.out.println(calcul("rrettyuiytii"));
    }
    static HashMap<Character, Boolean> calcul(@NotNull String str){
        HashMap<Character, Boolean> map = new HashMap<>();
        for (char ch : str.toCharArray() ){
            map.put(ch,map.containsKey(ch));
        }
        return map;
    }
}

