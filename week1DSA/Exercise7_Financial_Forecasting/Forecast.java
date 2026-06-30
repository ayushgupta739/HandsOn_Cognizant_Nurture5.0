package week1DSA.Exercise7_Financial_Forecasting;

public class Forecast {

    public double futureValue(double currentValue, double growthRate, int years) {

        
        if (years == 0) {
            return currentValue;
        }


        return futureValue(currentValue, growthRate, years - 1) * (1 + growthRate);
    }

}
