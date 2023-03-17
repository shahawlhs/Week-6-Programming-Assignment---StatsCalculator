import java.util.Arrays;

public class StatsCalculatorRunner {
    public static void main(String[] args) {
        double [] values = {-5.5, 10.7, 0.0, -3.8, 1.2, 4.3, -2.5, 1.2, 7.0, -0.5};
        //double [] values = {20.0, 10.0, 5.0, 15.0, 25.0, 30.0, 8.0};

        StatsCalculator myCalculator = new StatsCalculator(values);


        myCalculator.print();
        myCalculator.sortData();
        myCalculator.printSorted();
        myCalculator.printFiveNumberSummary();
        System.out.println(myCalculator.calculateMean());
    }

}
