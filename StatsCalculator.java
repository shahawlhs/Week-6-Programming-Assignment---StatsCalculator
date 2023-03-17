import java.util.Arrays;

/**
 * @file StatsCalculator.java
 * @date 3/15/23
 * @author Ajay Shah
 *
 * @description Runs a stats calculator that returns the min, max, sum, average, median, and quartiles
 * of your data.
 */
public class StatsCalculator {
    private double[] values;
    private double[] sortedValues;


    private StatsCalculator() {
        values = new double[20];
        sortedValues = new double[20];
    }
    public StatsCalculator(double[] values) {
        this.values = values;
        sortedValues = new double[values.length];
    }



    /**
     * Prints out the data of the array
     */
    public void print(){
        System.out.print("Your data is: ");
        for(double i: values){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * Sorts the data of the array
     */

    public void sortData(){
        for(int i = 0; i < values.length; i++){
            sortedValues[i] = values[i];
        }
        Arrays.sort(sortedValues);
    }

    public void printSorted(){
        sortData();
        System.out.print("Your sorted data is: ");
        for(double sortedValues : sortedValues){
            System.out.print(sortedValues + " ");
        }
        System.out.println();
    }



    /**
     * Calculates the max values of the array
     * @return prints out the max value of the array
     */
    public double calculateMax(){
        double max = values[0];
        for(int i = 1; i < values.length; i++){
            if(values[i] >= max){
                max = values[i];
            }
        }
        return max;
    }

    /**
     * Calculates the min value of the array
     * @return the min value of the array
     */

    public double calculateMin(){
        double min = values[0];
        for(int i = 1; i < values.length; i++){
            if(values[i] < min){
                min = values[i];
            }
        }
        return min;
    }

    /**
     * Calculates the sum of the array
     * @return the sum of the array
     */

    public double calculateSum(){
        double sum = 0;
        for(int i = 0; i < values.length; i++){
            sum += values[i];
        }
        return sum;
    }

    /**
     * Calculates the median of the array
     * @return the median of the array
     */

    public double calculateMedian(){
        int length = sortedValues.length;
        double median = 0.0;
        //odd
        if (length %2 != 0){
            int indexOfMedian = (length / 2);
            median = sortedValues[indexOfMedian];
        }
        //even
        else{
            int indexOfMedian = (length / 2);
            int indexOfMedian2 = (length / 2) - 1;
            double median1 = sortedValues[indexOfMedian];
            double median2 = sortedValues[indexOfMedian2];
            median = (median1 + median2) / 2;
        }
        return median;
    }

    /**
     * Calculates the mean (average) of the array
     * @return the mean (average) of the array
     */

    public double calculateMean(){
        double total = calculateSum();
        int length = values.length;
        double mean = total / length;
        System.out.print("The mean is: ");
        return mean;
    }

    /**
     * Calculates the first quartile of the array
     * @return the first quartile of the array
     */

    public double calculateFirstQuartile(){
        int length = sortedValues.length;
        double quartile1 = 0.0;
        //odd
        if (length %2 != 0){
            int indexOfQuartile1 = (length / 4);
            quartile1 = sortedValues[indexOfQuartile1];
        }
        //even
        else{
            double start = sortedValues[0];
            int indexOfEnd = (length/2) - 1;
            int end = indexOfEnd / 2;
            quartile1  = sortedValues[end];
        }
        return quartile1;
    }

    /**
     *
     * Calculates the third quartile of the array
     * @return the third quartile of the array
     */

    public double calculateThirdQuartile(){
        int length = sortedValues.length;
        double quartile3 = 0.0;
        //odd
        if(length % 2 != 0){
            int indexOfQuartile3 = ((3 * (length)) / 4);
            quartile3 = sortedValues[indexOfQuartile3];
        }
        //even
        else{
            int indexOfStart = (length / 2) + 1;
            int indexOfEnd = (length - 1);
            int difference = indexOfEnd - indexOfStart;
            int place = difference / 2;
            int index = place + indexOfStart;
            quartile3 = sortedValues[index];
        }
        return quartile3;
    }

    /**
     * Takes the calculations of the min, first quartile, median, third quartile, and max, and displays
     * them in a five number summary.
     */

    public void printFiveNumberSummary(){
        System.out.println("The five number summary is: ");
        System.out.println("     Minimum: " + calculateMin());
        System.out.println("     First Quartile: " + calculateFirstQuartile());
        System.out.println("     Median: " + calculateMedian());
        System.out.println("     Third Quartile: " + calculateThirdQuartile());
        System.out.println("     Maximum: " + calculateMax());
    }


}
