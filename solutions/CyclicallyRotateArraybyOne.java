public class CyclicRotateByOne {
    public static void rotate(int[] arr) {
        int n = arr.length;
        if (n <= 1) return;

        int i = 0, j = n - 1;
        while (i != j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotate(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        // Output: 5 1 2 3 4
    }
}
