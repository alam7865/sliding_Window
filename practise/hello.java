import java.util.*;

public class hello {
    public static void main(String[] args) {
        int n = 4;
        int k = 2;

        int arr[] = { 100, 200, 300, 400 };

        int sum = 0;
        int i = 0;
        int max = 0;

        if (arr.length < k) {
            // break;
        }

        while (i < k) {
            sum += arr[i];
            i++;
        }

        int x1 = 0;

        max = Math.max(max, sum);
        for (int x = k; x < arr.length; x++) {
            sum -= arr[x1];
            x1++;
            sum += arr[x];
            max = Math.max(max, sum);
        }

        System.out.println("Max: " + max);
    }
}