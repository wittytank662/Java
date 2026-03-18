public class contactsTester {
    public static void main(String[] args) {
        contacts[] people = {
            new contacts("John Doe", "Cousin", "Mar 28", "123-456-7890", "JohnDoe@gmail.com"),
            new contacts("Richard Roe", "Cousin", "Feb 19", "123-654-0987", "RichardRoe@gmail.com"),
            new contacts("James Madison", "Uncle", "Sep 27", "138-938-4029", "JMadison@hotmail.com"),
            new contacts("Jackson Baker", "Uncle", "Jan 5", "138-837-3033", "JacksonB@outlook.com"),
            new contacts("Fredrick Miller", "Friend", "May 30", "203-937-8320", "FredrickMiller@gmail.com"),
            new contacts("Issac Beck", "Nephew", "Feb 20", "138-384-2374", "IssacB@outlook.com"),
            new contacts("Homer Peterson", "Dad", "Jun 12", "138-739-2398", "HomerPeterson@gmail.com"),
            new contacts("Theo Peterson", "Brother", "Aug 21", "138-384-9258", "TheoPeterson@gmail.com"),
            new contacts("Marge Peterson", "Mom", "Mar 19", "138-983-4382", "MargePeterson@gmail.com"),
            new contacts("Sandra Peterson", "Sister", "Nov 3", "138-038-1739", "SandraPeterson@gmail.com")
        };

        System.out.println("========================================");
        System.out.println("=            Original  List            =");
        System.out.println("========================================");
        printArray(people);

        insertionSortByName(people);

        System.out.println("========================================");
        System.out.println("=        Binary Search  By Name        =");
        System.out.println("========================================");
        System.out.println(">> Seaching for: \"Marge Peterson\"");
        int nameResult = binarySearchByName(people, "Marge Peterson");
        if (nameResult >= 0) {
            System.out.println("   FOUND: " + people[nameResult]);
        } else {
            System.out.println("   NOT FOUND.");
        }

        System.out.println();
        System.out.println(">> Searching for: \"Bruce Wayne\"");
        int missingName = binarySearchByName(people, "Bruce Wayne");
        if (missingName >= 0) {
            System.out.println("   FOUND: " + people[missingName]);
        } else {
            System.out.println("   NOT FOUND.");
        }

        selectionSortByRelation(people);

        System.out.println("========================================");
        System.out.println("=      Binary Search  By Relation      =");
        System.out.println("========================================");

        System.out.println(">> Searching for relation: \"Cousin\"");
        binarySearchByRelation(people, "Cousin");

        System.out.println();
        System.out.println(">> Searching for relation: \"Uncle\"");
        binarySearchByRelation(people, "Uncle");

        System.out.println();
        System.out.println(">> Searching for relation: \"Grandparent\"");
        binarySearchByRelation(people, "Grandparent");

        System.out.println("========================================");
        System.out.println("=   Sequential Search By Birth Month   =");
        System.out.println("========================================");

        System.out.println(">> Searching for birth month: \"Feb\"");
        sequentialSearchByMonth(people, "Feb");

        System.out.println();
        System.out.println(">> Searching for birth month: \"Mar\"");
        sequentialSearchByMonth(people, "Mar");

        System.out.println();
        System.out.println(">> Searching for birth month: \"Jul\"");
        sequentialSearchByMonth(people, "Jul");

        System.out.println("========================================");
        System.out.println("=  Sequential Search  By Phone Number  =");
        System.out.println("========================================");

        System.out.println(">> Searching for phone: \"138-384-2374\"");
        sequentialSearchByPhone(people, "138-384-2374");

        System.out.println();
        System.out.println(">> Searching for phone: \"999-000-0000\"");
        sequentialSearchByPhone(people, "999-000-0000");

        System.out.println("========================================");
        System.out.println("=  Sequential Search By Email Address  =");
        System.out.println("========================================");

        System.out.println(">> Searching for email: \"TheoPeterson@gmail.com\"");
        sequentialSearchByEmail(people, "TheoPeterson@gmail.com");

        System.out.println();
        System.out.println(">> Searching for email: \"nobody@nowhere.com\"");
        sequentialSearchByEmail(people, "nobody@nowhere.com");
        
        timeConverter someObject = new timeConverter(60);


        System.out.println(someObject.convertToHours(18.4));

    }

    public static void printArray(contacts[] arr) {
        System.out.printf("%-25s %-12s %-12s %-16s %-30s%n", "Name", "Relation", "Birthday", "Phone", "Email");
        System.out.println("\n--------------------------------------------------------------------------------");
        for (contacts c : arr) {
            System.out.println(c);
        }
        System.out.println();
    }
    
    public static void linearPrint(contacts[] arr, int[] indices, int count) {
        if (count == 0) {
            System.out.println("   No matches found.");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println("   " + arr[indices[i]]);
        }
    }

    public static void insertionSortByName(contacts[] arr) {
        for (int i = 1; i < arr.length; i++) {
            contacts key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].getName().compareToIgnoreCase(key.getName()) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void selectionSortByRelation(contacts[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].getRelation().compareToIgnoreCase(arr[minIndex].getRelation()) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                contacts temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static int binarySearchByName(contacts[] arr, String target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = arr[mid].getName().compareToIgnoreCase(target);
            if (cmp == 0) {
                return mid;
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void binarySearchByRelation(contacts[] arr, String target) {
        int low = 0, high = arr.length - 1, found = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = arr[mid].getRelation().compareToIgnoreCase(target);
            if (cmp == 0) {
                found = mid;
                break;
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (found == -1) {
            System.out.println("   NOT FOUND: No contacts with relation \"" + target + "\".");
            return;
        }

        int[] indices = new int[arr.length];
        int count = 0;
        int left = found;
        while (left >= 0 && arr[left].getRelation().equalsIgnoreCase(target)) {
            left--;
        }
        int right = found;
        while (right < arr.length && arr[right].getRelation().equalsIgnoreCase(target)) {
            right++;
        }

        for (int i = left + 1; i < right; i++) {
            indices[count++] = i;
        }

        System.out.println("   Matches found (" + count + "):");
        linearPrint(arr, indices, count);
    }

    public static void sequentialSearchByMonth(contacts[] arr, String month) {
        boolean found = false;
        for (contacts c : arr) {
            if (c.getBirthday().substring(0, 3).equalsIgnoreCase(month)) {
                System.out.println("   " + c);
                found = true;
            }
        }
        if (!found) System.out.println("   NOT FOUND: No contacts born in \"" + month + "\".");
    }

    public static void sequentialSearchByPhone(contacts[] arr, String phone) {
        boolean found = false;
        for (contacts c : arr) {
            if (c.getPhone().equals(phone)) {
                System.out.println("   " + c);
                found = true;
            }
        }
        if (!found) System.out.println("   NOT FOUND: No contacts with phone \"" + phone + "\".");
    }

    public static void sequentialSearchByEmail(contacts[] arr, String email) {
        boolean found = false;
        for (contacts c : arr) {
            if (c.getEmail().equalsIgnoreCase(email)) {
                System.out.println("   " + c);
                found = true;
            }
        }
        if (!found) System.out.println("   NOT FOUND: No contacts with email \"" + email + "\".");
    }
}
