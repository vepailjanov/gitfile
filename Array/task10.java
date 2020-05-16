package Array;

public class task10 {
    public static void main(String[] args) {
        String[][] prices = {{"Costco","Bread", "Water", "Solt"},
                            {"Food","$0.25", "$0.27","$0.30"},
                            {"BJ's","$0.78", "$0.68","$0.94"},
                            {"Aldi","$0.34", "$0.62","$0.37"}};
        for (int i = 0; i <= prices.length-1; i++) {
            System.out.println(prices[0][i]+ " " + prices[1][i] + " " + prices[2][i] + " " + prices[3][i]);
        }
    }
}
