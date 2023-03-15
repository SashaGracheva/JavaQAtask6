import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.stats.StatsService;

public class StatsServiceTests {

    @Test
    public void getSumSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSumSales = 180;
        long actualSumSales = service.sumSales(sales);

        Assertions.assertEquals(expectedSumSales, actualSumSales);
    }


    @Test
    public void getAverageSalesInMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAverage = 15;
        long actualAverage = service.averageSaleInMonth(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }


    @Test
    public void shouldCalculateMonthNumberOfMaxSale() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthMaxSale = 8;
        int actualMonthMaxSale = service.maxSale(sales);

        Assertions.assertEquals(expectedMonthMaxSale, actualMonthMaxSale);
    }


    @Test
    public void shouldCalculateMonthNumberOfMinSale() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthMinSale = 9;
        int actualMonthMinSale = service.minSale(sales);

        Assertions.assertEquals(expectedMonthMinSale, actualMonthMinSale);
    }


    @Test
    public void getNumberOfMonthsUnderAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        int expectedNumberUnder = 5;
        int actualNumberUnder = service.numberOfMonthsUnderAverage(sales);

        Assertions.assertEquals(expectedNumberUnder, actualNumberUnder);

    }


    @Test
    public void getNumberOfMonthsOverAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        int expectedNumberOver = 5;
        int actualNumberOver = service.numberOfMonthsOverAverage(sales);

        Assertions.assertEquals(expectedNumberOver, actualNumberOver);

    }
}
