package Microsoft.chapter_d;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class M_d_01 {
    public static void main(String[] args) {

    }
}

class Solution_M_d_01 {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        char[] digis = digits.toCharArray();
        if (digis.length == 0) {
            return result;
        }
        letterCombinations(0, digis, map, result, "");
        return result;
    }

    public void letterCombinations(int index, char[] digis, Map<Character, String> map,List<String> result,String lastStr) {
        if (index == digis.length) {
            result.add(lastStr);
            return;
        }
        char now = digis[index];
        String digiRepresent = map.get(now);
        for (char digiRepresentChar : digiRepresent.toCharArray()) {
            String nowStr = lastStr + digiRepresentChar;
            letterCombinations(index + 1, digis, map, result, nowStr);
        }
    }
}