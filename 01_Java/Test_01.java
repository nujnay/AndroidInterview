import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

class Test_01{
    public static void main(String[]args){
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.synchronizedList(arrayList);

        HashMap<String, String> hashMap = new HashMap<>();

        HashSet<String> hashSet = new HashSet<>();
    }
}
