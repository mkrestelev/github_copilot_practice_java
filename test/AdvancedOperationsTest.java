
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AdvancedOperationsTest {
    private AdvancedOperations advOps;

    @BeforeEach
    public void setUp() {
        advOps = new AdvancedOperations();
    }

    @Test
    public void testFindMax() {
        int result = advOps.findMax(new int[]{1, 2, 3, 4, 5});
        assertEquals(5, result);
    }

    @Test
    public void testReverseString() {
        String result = advOps.reverseString("hello");
        assertEquals("olleh", result);
    }

    @Test
    public void testFormatDate() {
        LocalDate date = LocalDate.of(2023, 1, 1);
        String result = advOps.formatDate(date);
        assertEquals("2023-01-01", result);
    }

    @Test
    public void testFactorial() {
        int result = advOps.factorial(5);
        assertEquals(120, result);
    }

    @Test
    public void testCalculateStatistics() {
        Map<String, Object> result = advOps.calculateStatistics(new int[]{1, 2, 3, 4, 5});
        assertEquals(15, result.get("sum"));
        assertEquals(3.0, result.get("average"));
        assertEquals(1, result.get("min"));
        assertEquals(5, result.get("max"));
    }

    @Test
    public void testCalculateStatisticsEmptyArray() {
        Map<String, Object> result = advOps.calculateStatistics(new int[]{});
        assertEquals(0, result.get("sum"));
        assertEquals(Double.NaN, result.get("average"));
        assertNull(result.get("min"));
        assertNull(result.get("max"));
    }

    @Test
    public void testCalculateStatisticsSingleElement() {
        Map<String, Object> result = advOps.calculateStatistics(new int[]{42});
        assertEquals(42, result.get("sum"));
        assertEquals(42.0, result.get("average"));
        assertEquals(42, result.get("min"));
        assertEquals(42, result.get("max"));
    }

    @Test
    public void testCalculateStatisticsNegativeNumbers() {
        Map<String, Object> result = advOps.calculateStatistics(new int[]{-1, -2, -3, -4, -5});
        assertEquals(-15, result.get("sum"));
        assertEquals(-3.0, result.get("average"));
        assertEquals(-5, result.get("min"));
        assertEquals(-1, result.get("max"));
    }
}