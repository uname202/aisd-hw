import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArraysTest {
    @Test
    public void testBinarySearchInt() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(2, Arrays.binarySearch(arr, 3));
        assertEquals(0, Arrays.binarySearch(arr, 1));
        assertTrue(Arrays.binarySearch(arr, 6) < 0);
        assertEquals(2, Arrays.binarySearch(arr, 0, 5, 3));
    }

    @Test
    public void testBinarySearchChar() {
        char[] arr = {'а', 'б', 'в', 'г'};
        assertEquals(1, Arrays.binarySearch(arr, 'б'));
        assertEquals(3, Arrays.binarySearch(arr, 'г'));
        assertTrue(Arrays.binarySearch(arr, 'я') < 0);
        assertEquals(1, Arrays.binarySearch(arr, 0, 4, 'б'));
    }

    @Test
    public void testBinarySearchDouble() {
        double[] arr = {1.0, 2.0, 3.0, 4.0};
        assertEquals(1, Arrays.binarySearch(arr, 2.0));
        assertEquals(3, Arrays.binarySearch(arr, 4.0));
        assertTrue(Arrays.binarySearch(arr, 5.0) < 0);
        assertEquals(1, Arrays.binarySearch(arr, 0, 4, 2.0));
    }

    @Test
    public void testBinarySearchFloat() {
        float[] arr = {1.0f, 2.0f, 3.0f, 4.0f};
        assertEquals(1, Arrays.binarySearch(arr, 2.0f));
        assertEquals(3, Arrays.binarySearch(arr, 4.0f));
        assertTrue(Arrays.binarySearch(arr, 5.0f) < 0);
        assertEquals(1, Arrays.binarySearch(arr, 0, 4, 2.0f));
    }

    @Test
    public void testBinarySearchLong() {
        long[] arr = {1L, 2L, 3L, 4L};
        assertEquals(1, Arrays.binarySearch(arr, 2L));
        assertEquals(3, Arrays.binarySearch(arr, 4L));
        assertTrue(Arrays.binarySearch(arr, 5L) < 0);
        assertEquals(1, Arrays.binarySearch(arr, 0, 4, 2L));
    }

    @Test
    public void testBinarySearchShort() {
        short[] arr = {1, 2, 3, 4};
        assertEquals(1, Arrays.binarySearch(arr, (short)2));
        assertEquals(3, Arrays.binarySearch(arr, (short)4));
        assertTrue(Arrays.binarySearch(arr, (short)5) < 0);
        assertEquals(1, Arrays.binarySearch(arr, 0, 4, (short)2));
    }

    @Test
    public void testBinarySearchByte() {
        byte[] arr = {1, 2, 3, 4};
        assertEquals(1, Arrays.binarySearch(arr, (byte)2));
        assertEquals(3, Arrays.binarySearch(arr, (byte)4));
        assertTrue(Arrays.binarySearch(arr, (byte)5) < 0);
        assertEquals(1, Arrays.binarySearch(arr, 0, 4, (byte)2));
    }

    @Test
    public void testBinarySearchWithComparator() {
        String[] arr = {"яблоко", "банан", "вишня", "груша"};
        Comparator<String> comp = String::compareTo;
        assertEquals(1, Arrays.binarySearch(arr, "банан", comp));
        assertEquals(3, Arrays.binarySearch(arr, "груша", comp));
        assertTrue(Arrays.binarySearch(arr, "яшма", comp) < 0);
        assertEquals(1, Arrays.binarySearch(arr, 0, 4, "банан", comp));
    }

    @Test
    public void testAsList() {
        Integer[] arr = {1, 2, 3};
        List<Integer> list = Arrays.asList(arr);
        assertEquals(3, list.size());
        assertEquals(Integer.valueOf(1), list.get(0));
        assertEquals(Integer.valueOf(3), list.get(2));
        
        String[] strArr = {"а", "б", "в"};
        List<String> strList = Arrays.asList(strArr);
        assertEquals(3, strList.size());
        assertEquals("а", strList.get(0));
        assertEquals("в", strList.get(2));
    }
}
