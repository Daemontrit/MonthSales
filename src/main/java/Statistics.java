public class Statistics {
    public int sumSales(int[] monthSales) {
        int sum = 0;
        for (int t : monthSales) {
            sum += t;
        }
        return sum;
    }

    public int mean(int[] monthSales) {
        int countMonth = monthSales.length;
        int res = sumSales(monthSales) / countMonth;
        return res;
    }

    public int maxMonth(int[] monthSales) {
        int maxMonthSales = 0;
        for (int i = 0; i < monthSales.length; i++) {
            if (monthSales[i] >= monthSales[maxMonthSales]) {
                maxMonthSales = i;
            }
        }
        return maxMonthSales + 1;
    }

    public int minMonth(int[] monthSales) {
        int minMonthSales = 0;
        int month = 0;
        for (int m : monthSales) {
            if (m <= monthSales[minMonthSales]) {
                minMonthSales = month;
            }
            month++;
        }
        return minMonthSales + 1;
    }

    public int minMean(int[] monthSales) {
        int count = 0;
        int middle = mean(monthSales);
        for (int month : monthSales) {
            if (month < middle) {
                count++;
            }
        }
        return count;
    }

    public int maxMean(int[] monthSales) {
        int count = 0;
        double middle = mean(monthSales);
        for (int month : monthSales) {
            if (month > middle) {
                count++;
            }
        }
        return count;
    }
}

