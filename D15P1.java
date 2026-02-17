class Solution {
    static void rotateArr(int arr[], int d) {

        int len = arr.length;
        d = d % len;

        int[] dummy1 = new int[d];
        int[] dummy2 = new int[len];

        // copy first d elements
        for (int i = 0; i < d; i++) {
            dummy1[i] = arr[i];
        }

        int yen = 0;

        // copy remaining elements
        for (int i = d; i < len; i++) {
            dummy2[yen++] = arr[i];
        }

        // append first part
        for (int i = 0; i < d; i++) {
            dummy2[yen + i] = dummy1[i];
        }

        // copy back into original array (IMPORTANT)
        for (int i = 0; i < len; i++) {
            arr[i] = dummy2[i];
        }
    }
}
