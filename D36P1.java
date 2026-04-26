class Solution {
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        d = d % n;  // handle d > n

        int[] newarr = new int[n];
        int count = 0;

        // copy from d to end
        for (int i = d; i < n; i++) {
            newarr[count++] = arr[i];
        }

        // copy from 0 to d-1
        for (int i = 0; i < d; i++) {
            newarr[count++] = arr[i];
        }

        // copy back to original array
        for (int i = 0; i < n; i++) {
            arr[i] = newarr[i];
        }
    }
}