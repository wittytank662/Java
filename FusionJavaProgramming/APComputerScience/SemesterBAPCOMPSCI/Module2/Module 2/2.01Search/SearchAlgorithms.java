public class SearchAlgorithms {
    public static void main(String[] args) {
        /*
            Search Alogirthms:
                * These algorithms will find an element and return the loation of it in the structure.
                * Returns -1 if not found.
                
            Sequential Search:
                1.  Sequential search is a simple algorithm that will travese a data structure until the element we are 
                    searching for is found.

            Binary Search:
                1.  Binary search will split the list in half everytime we do a comparison. We will known if the value is on the left
                    or right side since the list must be sorted.

                    **Binary search is much better than sequential but requires the list to be sorted

            Big O notation:
                ex) O(n) -> the amount of operations/time to execute will depend on n(the size of the dat structure)

            Tiem Complexity:
            Sequential Search - O(n)
            Binary Search - O(log n)
        */

                    int[] arr = {14,7,24,8,11,31,6};
                    sort(arr);
                    printArr(arr);
                    System.out.println("-----------------------------------------------------------------------");
                    int ans = BinarySearch(arr, 31);

                    if(ans != -1){

                    }
    }

    public static void printArr(int[] arr){
        for (int x : arr){
            System.out.println(x);
        }
    }

    public static int sort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int min_index = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
        }
        return -1;
    }

    public static int SequentialSearch(int[] arr, int find){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == find){
                return i;
            }
        }
        return -1;
    }

    public static int BinarySearch(int[] arr, int find){
        int L = 0;
        int R = arr.length - 1;
        int counter = 0;

        while (L <= R) {
            int M = (L + R) / 2;
            counter++;
            System.out.println("Counter: " + counter);
            if(arr[M] == find)
                return M;
            else if(arr[M] < find)
                L = M + 1;
            else
                R = M - 1;
        }
        return -1;
    }
}
