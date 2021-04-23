import java.util.HashSet;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;

public class Test_02 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("");
        TreeSet<Test2> treeSet = new TreeSet<>();
        treeSet.add(new Test2());
        treeSet.add(new Test2());

        TreeMap<Test2, String> treeMap = new TreeMap<>();
        treeMap.put(new Test2(), "");
    }

    static class Test2 {

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
