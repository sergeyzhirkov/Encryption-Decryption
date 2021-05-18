import java.util.*;

class ListOperations {
    public static void changeHeadsAndTails(LinkedList<String> linkedList, ArrayList<String> arrayList) {
        String bufStr = linkedList.get(0);
        linkedList.set(0, arrayList.get(0));
        arrayList.set(0, bufStr);
        bufStr = linkedList.get(linkedList.size() - 1);
        linkedList.set(linkedList.size() - 1, arrayList.get(arrayList.size() - 1));
        arrayList.set(arrayList.size() - 1, bufStr);

    }
}