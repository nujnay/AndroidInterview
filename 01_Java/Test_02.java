import java.util.HashSet;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;

public class Test_02 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("");
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("");
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("", "");
    }

    class EqualTest {
        int a = 1;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            EqualTest equalTest = (EqualTest) o;
            return a == equalTest.a;
        }

        @Override
        public int hashCode() {
            return Objects.hash(a);
        }
    }
}
