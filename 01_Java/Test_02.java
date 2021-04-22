import java.util.Objects;

public class Test_02 {
    public static void main(String[] args) {

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
