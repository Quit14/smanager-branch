import org.junit.jupiter.api.*;

@DisplayName("Тестирование: SalesManager")
public class SalesManagerTest {
    private SalesManager salesManager;

    @BeforeEach
    void setUp() {
        salesManager = new SalesManager(new long[]{1800, 400, 599, 999, 1020, 2035});
    }

    @Test
    @DisplayName("Тест поиска максимума")
    void max() {
        Assertions.assertEquals(2035, salesManager.max());
    }

    @Test
    @DisplayName("Тест поиска усеченного среднего")
    void average() {
        Assertions.assertEquals(1104, salesManager.average());
    }

    @Test
    @DisplayName("Тест усеченное среднее из двух значений")
    void averageNull () {
        SalesManager sm = new SalesManager(new long[] {100, 1000});
        Assertions.assertThrows(ArithmeticException.class, sm::average);
    }
}
