import java.util.Arrays;

public class minimum1{

    static int getMin(int arr[], int n) {
        return Arrays.stream(arr).min().getAsInt();
    }

    public static void main(String[] args) {
        int arr[] = {10, 1, 32, 3, 45};
        int n = arr.length;
        System.out.println("Min: " + getMin(arr, n));
    }
}
