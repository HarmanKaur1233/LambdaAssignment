import java.util.Arrays;

public class Implementation {
    public static final ArrayProcessor max = (arr) -> Arrays.stream(arr).max().orElse(-1);
    public static final ArrayProcessor min = (arr) -> Arrays.stream(arr).min().orElse(-1);
    public static final ArrayProcessor sum = (arr) -> Arrays.stream(arr).sum();
    public static final ArrayProcessor avg = (arr) -> Arrays.stream(arr).average().orElse(-1);

    public static ArrayProcessor counter(double value) {
        return (arr) -> Arrays.stream(arr).filter(x -> x == value).count();
    }

    public static void main(String[] args) {
        double[] arr = new double[]{1.00, 29.50, 99.50, 22.00, 5.00, 5.00};
        System.out.println("Maximum value: " + max.apply(arr));
        System.out.println("Minimum value: " + min.apply(arr));
        System.out.println("Sum of all values: " + sum.apply(arr));
        System.out.println("Average of all values: " + avg.apply(arr));
        ArrayProcessor arrayProcessor = counter(5.00);
        System.out.println("Number of times 5 occurs in the array: " + arrayProcessor.apply(arr));
    }
}
