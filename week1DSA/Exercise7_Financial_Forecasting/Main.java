package week1DSA.Exercise7_Financial_Forecasting;

public class Main {
    public static void main(String[] args) {

        Forecast forecast = new Forecast();

        double currentValue = 10000;
        double growthRate = 0.10;
        int years = 5;

        double future = forecast.futureValue(currentValue, growthRate, years);

        System.out.println("Current Value: " + currentValue);
        System.out.println("Growth Rate: " + (growthRate * 100) + "%");
        System.out.println("Years: " + years);
        System.out.println("Future Value: " + future);
    }
    
}
