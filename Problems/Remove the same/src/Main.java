import java.util.*;

class ListOperations {
    public static void removeTheSame(LinkedList<String> linkedList, ArrayList<String> arrayList) {
        int index = 0;
        while (index < arrayList.size()) {
            if (arrayList.get(index).equals(linkedList.get(index))) {
                arrayList.remove(index);
                linkedList.remove(index);
            } else {
                index++;
            }
        }
    }
}