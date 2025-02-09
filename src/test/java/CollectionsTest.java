import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CollectionsTest {
    @Test
    public void testBinarySearchComparable() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(2, Collections.binarySearch(list, 3));
        assertEquals(0, Collections.binarySearch(list, 1));
        assertEquals(4, Collections.binarySearch(list, 5));
        assertTrue(Collections.binarySearch(list, 6) < 0);
        
        List<Double> doubleList = Arrays.asList(1.0, 2.0, 3.0, 4.0);
        assertEquals(1, Collections.binarySearch(doubleList, 2.0));
        assertTrue(Collections.binarySearch(doubleList, 5.0) < 0);
    }

    @Test
    public void testBinarySearchComparator() {
        List<String> list = Arrays.asList("абрикос", "банан", "вишня", "груша");
        Comparator<String> comp = String::compareTo;
        assertEquals(0, Collections.binarySearch(list, "абрикос", comp));
        assertEquals(2, Collections.binarySearch(list, "вишня", comp));
        assertTrue(Collections.binarySearch(list, "яшма", comp) < 0);
        
        // Тест с пользовательским компаратором
        List<String> caseInsensitiveList = Arrays.asList("абрикос", "банан", "Вишня");
        Comparator<String> caseInsensitiveComp = String::compareToIgnoreCase;
        assertEquals(0, Collections.binarySearch(caseInsensitiveList, "абрикос", caseInsensitiveComp));
        assertEquals(2, Collections.binarySearch(caseInsensitiveList, "вишня", caseInsensitiveComp));
    }
    
    @Test
    public void testBinarySearchWithEmptyList() {
        List<Integer> emptyList = Arrays.asList();
        assertTrue(Collections.binarySearch(emptyList, 1) < 0);
        
        Comparator<Integer> comp = Integer::compareTo;
        assertTrue(Collections.binarySearch(emptyList, 1, comp) < 0);
    }
    
    @Test
    public void testBinarySearchWithDuplicates() {
        List<Integer> listWithDuplicates = Arrays.asList(1, 2, 2, 2, 3);
        // Должен вернуть индекс любого совпадающего элемента
        int index = Collections.binarySearch(listWithDuplicates, 2);
        assertTrue(index >= 1 && index <= 3);
    }
}
