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
        Map<String, String> map = new HashMap<>();
        map.put("2", "abc");
        map.put("3", "def");
        map.put("4", "ghi");
        map.put("5", "jkl");
        map.put("6", "mno");
        map.put("7", "pqrs");
        map.put("8", "tuv");
        map.put("9", "wxyz");
        char[] digis = digits.toCharArray();
        letterCombinations(digis, 0, map, "", result);
        return result;
    }

    public void letterCombinations(char[] digis, int index, Map<String, String> map, String part, List<String> result) {
        int digi = digis[index];
        String now = map.get(digi);


        if (index == digis.length - 1) {
            result.add(part);
        }
    }
}