import java.util.List;

/**
    Class to modify
*/
class ListMultiplicator {

    /**
        Repeats original list content provided number of times   
        @param list list to repeat
        @param n times to repeat, should be zero or greater
    */
	public static void multiply(List<?> list, int n) {
		captureMultiply(list, n);
	}

	private static <T> void captureMultiply(List<T> list, int n) {
		int listLength = list.size();
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < listLength; j++) {
				list.add(list.get(j));
			}
		}
		if (n == 0) {
			list.clear();
		}
	}
}