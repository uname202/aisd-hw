import java.util.Comparator;
import java.util.List;

class Collections {
    public static <T> int binarySearch(List<? extends Comparable<? super T>> list, T key) {
        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            Comparable<? super T> midVal = list.get(mid);
            int compareResult = midVal.compareTo(key);

            if (compareResult < 0)
                low = mid + 1;
            else if (compareResult > 0)
                high = mid - 1;
            else
                return mid;
        }
        return -(low + 1);
    }

    public static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> comparator) {
        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            T midVal = list.get(mid);
            int compareResult = comparator.compare(midVal, key);

            if (compareResult < 0)
                low = mid + 1;
            else if (compareResult > 0)
                high = mid - 1;
            else
                return mid;
        }
        return -(low + 1);
    }
}
