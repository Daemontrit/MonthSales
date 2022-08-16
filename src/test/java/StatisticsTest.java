import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatisticsTest {
    Statistics service = new Statistics();
    int[] arrMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void sumMonthTest() {
        int expected = 180;
        int actual = service.sumSales(arrMonth);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void meaningTest() {
        int expected = 15;
        int actual = service.mean(arrMonth);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxMonthTest() {
        int expected = 8;
        int actual = service.maxMonth(arrMonth);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minMonthTest() {
        int expected = 9;
        int actual = service.minMonth(arrMonth);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minMeanTestResult() {
        int expected = 5;
        int actual = service.minMean(arrMonth);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxMeanTestResult() {
        int expected = 5;
        int actual = service.maxMean(arrMonth);

        Assertions.assertEquals(expected, actual);
    }
}
