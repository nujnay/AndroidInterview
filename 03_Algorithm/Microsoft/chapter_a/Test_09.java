package Microsoft.chapter_a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Test_09 {
    public static void main(String[] args) {
        Solution_a_09 solution_a_09 = new Solution_a_09();
        String[] strings = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        solution_a_09.groupAnagrams(strings);
    }
}

class Solution_a_09 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String s1 = new String(chars);
            if (map.containsKey(s1)) {
                map.get(s1).add(s);
            } else {
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add(s);
                map.put(s1, arrayList);
            }
        }
        List<List<String>> list = new ArrayList<>();
        for (String chars : map.keySet()) {
            System.out.println(chars);
            List<String> list1 = map.get(chars);
            list.add(list1);
        }
        return list;
    }
}