import java.util.ArrayList;
import java.util.Collections;

class Test_01{
    public static void main(String[]args){
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.synchronizedList(arrayList);
    }
}
