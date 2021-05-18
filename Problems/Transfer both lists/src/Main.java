import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class ListOperations {
    public static void transferAllElements(LinkedList<String> linkedList, ArrayList<String> arrayList) {
        for (int i = 0; i < linkedList.size(); i++) {
            String strBuf = linkedList.get(i);
            linkedList.set(i, arrayList.get(i));
            arrayList.set(i, strBuf);
        }
    }

}