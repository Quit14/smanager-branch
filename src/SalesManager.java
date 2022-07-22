public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
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
