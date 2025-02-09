import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Arrays {
    private static final int NOT_FOUND_POSITION_MULTIPLIER = -1;

    public static int binarySearch(byte[] array, byte key) {
        return binarySearch(array, 0, array.length, key);
    }

    public static int binarySearch(byte[] array, int fromIndex, int toIndex, byte key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            byte midVal = array[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid;
        }
        return (low + 1) * NOT_FOUND_POSITION_MULTIPLIER;
    }

    public static int binarySearch(char[] array, char key) {
        return binarySearch(array, 0, array.length, key);
    }

    public static int binarySearch(char[] array, int fromIndex, int toIndex, char key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            char midVal = array[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid;
        }
        return (low + 1) * NOT_FOUND_POSITION_MULTIPLIER;
    }

    public static int binarySearch(double[] array, double key) {
        return binarySearch(array, 0, array.length, key);
    }

    public static int binarySearch(double[] array, int fromIndex, int toIndex, double key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            double midVal = array[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid;
        }
        return (low + 1) * NOT_FOUND_POSITION_MULTIPLIER;
    }

    public static int binarySearch(float[] array, float key) {
        return binarySearch(array, 0, array.length, key);
    }

    public static int binarySearch(float[] array, int fromIndex, int toIndex, float key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            float midVal = array[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid;
        }
        return (low + 1) * NOT_FOUND_POSITION_MULTIPLIER;
    }

    public static int binarySearch(int[] array, int key) {
        return binarySearch(array, 0, array.length, key);
    }

    public static int binarySearch(int[] array, int fromIndex, int toIndex, int key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = array[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid;
        }
        return (low + 1) * NOT_FOUND_POSITION_MULTIPLIER;
    }

    public static int binarySearch(long[] array, long key) {
        return binarySearch(array, 0, array.length, key);
    }

    public static int binarySearch(long[] array, int fromIndex, int toIndex, long key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            long midVal = array[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid;
        }
        return (low + 1) * NOT_FOUND_POSITION_MULTIPLIER;
    }

    public static int binarySearch(short[] array, short key) {
        return binarySearch(array, 0, array.length, key);
    }

    public static int binarySearch(short[] array, int fromIndex, int toIndex, short key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            short midVal = array[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid;
        }
        return (low + 1) * NOT_FOUND_POSITION_MULTIPLIER;
    }

    public static <T> int binarySearch(T[] array, T key, Comparator<? super T> comparator) {
        return binarySearch(array, 0, array.length, key, comparator);
    }

    public static <T> int binarySearch(T[] array, int fromIndex, int toIndex, T key, Comparator<? super T> comparator) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            T midVal = array[mid];
            int compareResult = comparator.compare(midVal, key);

            if (compareResult < 0)
                low = mid + 1;
            else if (compareResult > 0)
                high = mid - 1;
            else
                return mid;
        }
        return (low + 1) * NOT_FOUND_POSITION_MULTIPLIER;
    }

    @SafeVarargs
    public static <T> List<T> asList(T... elements) {
        List<T> list = new ArrayList<>();
        Collections.addAll(list, elements);
        return list;
    }
}
