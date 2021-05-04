package Microsoft.chapter_a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Test_09 {

}

class Solution_a_09 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Character[], List<String>> map = new HashMap<>();
        List<List<String>> list = new ArrayList<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            if (map.containsKey(chars)) {
                map.get(chars).add(s);
            } else {
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add(s);
                list.add(arrayList);
            }
        }
        return list;
    }
}