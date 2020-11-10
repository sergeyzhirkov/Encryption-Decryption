import java.util.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> array = readArray();
        int count = array.get(array.size() - 1);
        array.remove(array.size() - 1);
        int ascendingOrder = searchAscOrd(array, count);
        List<Integer> resultArray = new ArrayList<>();
        for (Integer intCount : array) {
            if (Math.abs(count - intCount) == ascendingOrder) {
                resultArray.add(intCount);
            }
        }
        Collections.sort(resultArray);
        for (Integer i : resultArray) {
            System.out.print(i + " ");
        }
    }

    private static int searchAscOrd(ArrayList<Integer> array, int count) {
        List<Integer> compareArray = new ArrayList<>();
        for (Integer integer : array) {
            compareArray.add(Math.abs(count - integer));
        }
        Collections.sort(compareArray);
        return compareArray.get(0);
    }

    private static ArrayList<Integer> readArray() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (scanner.hasNextInt()) {
            arrayList.add(scanner.nextInt());
        }
        return arrayList;
    }
}