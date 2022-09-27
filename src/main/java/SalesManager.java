public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;

    }

    public long average() {
        long totalSum = 0;
        for (long sale : sales) {
            totalSum += sale;
        }
        long min = sales[0];
        for (long sale : sales) {
            if (min > sale) {
                min = sale;
            }
        }
        long av = (totalSum - min - max()) / (sales.length - 2);
        return av;
    }
}
