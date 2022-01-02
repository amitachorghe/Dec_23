import java.util.Arrays;

public class twosum {

    public void pairedElements(int arr[], int sum) {

        int low = 0;

        int high = arr.length - 1;

        while (low < high) {

            if (arr[low] + arr[high] == sum) {

                System.out.println("The pair is : (" + arr[low] + ", " + arr[high] + ")");

            }
            if (arr[low] + arr[high] > sum) {

                high--;

            } else {

                low++;

            }

        }

    }

    public static void main(String[] args) {
        int arr[] = { 2, 6, 4, -2, -5, 9, 3, 16 };

        Arrays.sort(arr);

        twosum sp = new twosum();

        sp.pairedElements(arr, 8);

    }
}
