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

    public int average() {
        int totalSum = 0;
        for (int sale : sales) {
            totalSum += sale;
        }
        int min = sales[0];
        for (int sale : sales) {
            if (min > sale) {
                min = sale;
            }
        }
        int av = (totalSum - min - max()) / (sales.length - 2);
        return av;
    }
}
