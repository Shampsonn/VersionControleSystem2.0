import java.util.Arrays;

public class AveregeIncome {
    protected int[] sales;
    public AveregeIncome(int[] sales){
        this.sales = sales;
    }
    public int average(){
        int max = sales[0];
        int min = sales[0];
        int averege = 0;
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
            if (sale > max){
                max = sale;
            }
            if (sale < min) {
                min = sale;
            }
        }
        averege = (sum - (max + min)) / (sales.length - 2);
        return averege;
    }
}
