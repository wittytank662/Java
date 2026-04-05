public class storageTester {
    public static void main(String[] args) {
        storage[] stock = {
            new storage("Cereal", "1083", 8.99, 25),
            new storage("Milk", "204", 5.99, 50),
            new storage("Crackers", "351", 3.00, 100),
            new storage("Bread", "4821", 4.29, 140),
            new storage("Eggs", "8021", 3.99, 400),
            new storage("Apples", "1543", 1.89, 300),
            new storage("Chicken breast", "6725", 6.49, 100),
            new storage("Cheese", "250", 4.99, 220),
            new storage("Pasta", "5591", 1.79, 350),
            new storage("Orange Juice", "2230", 3.49, 150)
        };

        printHeader("UNSORTED - Original Inventory");
        printArray(stock);

        printHeader("SORT BY NAME - Insertion Sort (Ascending)");
        sortNameInsertion(stock, 1);
        printArray(stock);

        printHeader("SORT BY NAME - Insertion Sort (Descending)");
        sortNameInsertion(stock, 0);
        printArray(stock);

        printHeader("SORT BY PRODUCT NUMBER - Selection Sort (Ascending)");
        sortProductNumSelection(stock, 1);
        printArray(stock);

        printHeader("SORT BY PRODUCT NUMBER - Selection Sort (Descending)");
        sortProductNumSelection(stock, 0);
        printArray(stock);

        printHeader("SORT BY PRICE - Merge Sort (Ascending)");
        sortPriceMerge(stock);
        printArray(stock);

        printHeader("SORT BY QUANTITY - Insertion Sort (Ascending)");
        sortQuantityInsertion(stock, 1);
        printArray(stock);

        printHeader("SORT BY QUANTITY - Insertion Sort (Descending)");
        sortQuantityInsertion(stock, 0);
        printArray(stock);
    }

    public static void printHeader(String label) {
        System.out.println("\n=== " + label + " ===");
        System.out.printf(" %-18s %-18s %-8s %-10s%n", "Name", "Product Number", "Price", "Quantity");
        System.out.println("----------------------------------------------------------");
    }

    public static void printArray(storage[] arr) {
        for (storage s : arr) {
            System.out.println(s);
        }
    }

    public static void sortNameInsertion(storage[] arr, int order) {
        for (int i = 1; i < arr.length; i++) {
            storage key = arr[i];
            int j = i - 1;

            if (order == 1) {
                while (j >= 0 && arr[j].getName().compareToIgnoreCase(key.getName()) > 0) {
                    arr[j + 1] = arr[j];
                    j--;
                }
            } else {
                while (j >= 0 && arr[j].getName().compareToIgnoreCase(key.getName()) < 0) {
                    arr[j + 1] = arr[j];
                    j--;
                }
            }
            arr[j + 1] = key;
        }
    }

    public static void sortProductNumSelection(storage[] arr, int order) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int targetIdx = i;

            for (int j = i + 1; j < n; j++) {
                int jVal = Integer.parseInt(arr[j].getProductNum());
                int targetVal = Integer.parseInt(arr[targetIdx].getProductNum());

                if (order == 1) {
                    if (jVal < targetVal) 
                        targetIdx = j;
                } else {
                    if (jVal > targetVal)
                        targetIdx = j;
                }
            }

            storage temp = arr[targetIdx];
            arr[targetIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void sortPriceMerge(storage[] arr) {
        if (arr.length <= 1) return;
        mergePrice(arr, 0, arr.length - 1);
    }

    public static void mergePrice(storage[] arr, int left, int right) {
        if (left >= right) return;

        int mid = (left + right) / 2;
        mergePrice(arr, left, mid);
        mergePrice(arr, mid + 1, right);
        mergePriceCombine(arr, left, mid, right);
    }

    public static void mergePriceCombine(storage[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        storage[] L = new storage[n1];
        storage[] R = new storage[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i].getPrice() <= R[j].getPrice()) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }
        while (i < n1) {
            arr[k++] = L[i++];
        }
        while (j < n2) {
            arr[k++] = R[j++];
        }
    }

    public static void sortQuantityInsertion(storage[] arr, int order) {
        for (int i = 1; i < arr.length; i++) {
            storage key = arr[i];
            int j = i - 1;

            if (order == 1) {
                while (j >= 0 && arr[j].getQuantity() > key.getQuantity()) {
                    arr[j + 1] = arr[j];
                    j--;
                }
            } else {
                while (j >= 0 && arr[j].getQuantity() < key.getQuantity()) {
                    arr[j + 1] = arr[j];
                    j--;
                }
            }
            arr[j + 1] = key;
        }
    }
}