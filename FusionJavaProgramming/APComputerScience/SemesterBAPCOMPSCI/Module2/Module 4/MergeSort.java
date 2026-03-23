public class MergeSort {
    public static void main(String[] args) {
        /*
            MergeSort:
                *Divide and conquer
                *Splits the array into sub arrays and then sorts while merging the sub arrays

            Time Complexity:
                O(n * log n)

            Space Complexity:
                O(n)
        */

        int[] arr = {14,8,3,7,16,20,4,1};
        PrintArray(arr);
        MergeSort(arr, arr.length);
        System.out.println("~~~~~~~~~~~~~~~~~ Merge Sort ~~~~~~~~~~~~~~~~~");
        PrintArray(arr);


    }

    public static void PrintArray(int[] arr) {
        for(int x: arr) {
            System.out.println(x);
        }
    }

    public static void MergeSort(int[] arr, int n) {
        //Base Case
        if(n < 2)
            return;

        int mid = n / 2;
        int[] L = new int[mid];
        int[] R = new int[n - mid];

        for(int i = 0; i < mid; i++) {
            L[i] = arr[i];
        }
        for(int i = mid; i < n; i++) {
            R[i - mid] = arr[i];
        }

        //Recursive Funciton Calls
        MergeSort(L, mid);
        MergeSort(R, n - mid);

        Merge(arr, L, R, mid, n - mid);
    }

    public static void Merge(int[] arr, int[] L, int[] R, int length1, int length2) {
        int i = 0, j = 0, k = 0;

        while(i < length1 && j < length2) {
            if(L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
                k++;
            }
            else {
                arr[k] = R[j];
                j++;
                k++;
            }
        }

        while(i < length1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j < length2) {
            arr[k] = R[j];
            j++;
            k++;
        }

    }
}