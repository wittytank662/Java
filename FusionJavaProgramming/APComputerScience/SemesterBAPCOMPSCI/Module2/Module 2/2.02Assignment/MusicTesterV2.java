public class MusicTesterV2 {
    public static void main(String[] args) {
        Music[] songs = {
            new Music("L o s e M y M i n d",                    2024, "PARTYNEXTDOOR"),
            new Music("Heaven or Hell",                         2020, "Don Toliver"),
            new Music("E85",                                    2026, "Don Toliver"),
            new Music("Diamonds From Sierra Leone",             2005, "Kanye West"),
            new Music("Ghost Town",                             2018, "Kanye West"),
            new Music("If I Ruled the World (Imagine That)",    1996, "Nas"),
            new Music("God Is",                                 2019, "Kanye West"),
            new Music("Changes",                                2007, "Tupac Shakur"),
            new Music("Hit 'Em Up",                             1996, "Tupac Shakur"),
            new Music("Denver",                                 2023, "Jack Harlow")
        };
        
        System.out.println("========================================");
        System.out.println("         ORIGINAL SONG LIST");
        System.out.println("========================================");
        printArray(songs);

        selectionSortByTitle(songs);

        System.out.println("\n========================================");
        System.out.println("  SEARCH BY TITLE: \"E85\" (found)");
        System.out.println("========================================");
        int idx = binarySearchByTitle(songs, "E85");
        if (idx != -1) {
            System.out.println("Found at index " + idx + ": " + songs[idx]);
        } else {
            System.out.println("No song titled \"E85\" was found.");
        }

        System.out.println("\n========================================");
        System.out.println("  SEARCH BY TITLE: \"STARGAZING\" (not found)");
        System.out.println("========================================");
        idx = binarySearchByTitle(songs, "STARGAZING");
        if (idx != -1)
            System.out.println("Found at index " + idx + ": " + songs[idx]);
        else
            System.out.println("No song titled \"STARGAZING\" was found.");

        insertionSortByYear(songs);

        System.out.println("\n========================================");
        System.out.println("  SEARCH BY YEAR: 1996  (multiple matches)");
        System.out.println("========================================");
        idx = binarySearchByYear(songs, 1996);
        if (idx != -1)
            printAllMatchesByYear(songs, idx, 1996);
        else
            System.out.println("No songs from the year 1996 were found.");

        System.out.println("\n========================================");
        System.out.println("  SEARCH BY YEAR: 2025  (not found)");
        System.out.println("========================================");
        idx = binarySearchByYear(songs, 2025);
        if (idx != -1)
            printAllMatchesByYear(songs, idx, 2025);
        else
            System.out.println("No songs from the year 2025 were found.");

        selectionSortByArtist(songs);

        System.out.println("\n========================================");
        System.out.println("  SEARCH BY ARTIST: \"Nas\"  (single match)");
        System.out.println("========================================");
        idx = binarySearchByArtist(songs, "Nas");
        if (idx != -1)
            printAllMatchesByArtist(songs, idx, "Nas");
        else
            System.out.println("No songs by \"Nas\" were found.");

        System.out.println("\n========================================");
        System.out.println("  SEARCH BY ARTIST: \"Kanye West\"  (multiple matches)");
        System.out.println("========================================");
        idx = binarySearchByArtist(songs, "Kanye West");
        if (idx != -1)
            printAllMatchesByArtist(songs, idx, "Kanye West");
        else
            System.out.println("No songs by \"Kanye West\" were found.");

        System.out.println("\n========================================");
        System.out.println("  SEARCH BY ARTIST: \"Taylor Swift\"  (not found)");
        System.out.println("========================================");
        idx = binarySearchByArtist(songs, "Taylor Swift");
        if (idx != -1)
            printAllMatchesByArtist(songs, idx, "Taylor Swift");
        else
            System.out.println("No songs by \"Taylor Swift\" were found.");
        
    }

    public static void printArray(Music[] arr) {
        System.out.printf("%-45s %-8s %-20s%n","Title", "Year", "Artist");
        System.out.println("-----------------------------------------------------------------------");
        for (Music m : arr) {
            System.out.println(m);
        }
    }

    public static void selectionSortByTitle(Music[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].getTitle().compareToIgnoreCase(arr[minIdx].getTitle()) < 0)
                    minIdx = j;
            }
            Music temp  = arr[i];
            arr[i]      = arr[minIdx];
            arr[minIdx] = temp;
        }
    }

    public static void insertionSortByYear(Music[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Music key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].getYear() > key.getYear()) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void selectionSortByArtist(Music[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].getArtist().compareToIgnoreCase(arr[minIdx].getArtist()) < 0)
                    minIdx = j;
            }
            Music temp  = arr[i];
            arr[i]      = arr[minIdx];
            arr[minIdx] = temp;
        }
    }

    public static int binarySearchByTitle(Music[] arr, String title) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = arr[mid].getTitle().compareToIgnoreCase(title);
            if (cmp == 0)     return mid;
            else if (cmp < 0) low  = mid + 1;
            else              high = mid - 1;
        }
        return -1;
    }

    public static int binarySearchByYear(Music[] arr, int year) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int midYear = arr[mid].getYear();
            if (midYear == year)     return mid;
            else if (midYear < year) low  = mid + 1;
            else                     high = mid - 1;
        }
        return -1;
    }

    public static int binarySearchByArtist(Music[] arr, String artist) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = arr[mid].getArtist().compareToIgnoreCase(artist);
            if (cmp == 0)     return mid;
            else if (cmp < 0) low  = mid + 1;
            else              high = mid - 1;
        }
        return -1;
    }

    public static void printAllMatchesByYear(Music[] arr, int midIndex, int year) {
        int left = midIndex;
        while (left > 0 && arr[left - 1].getYear() == year) left--;
        int right = midIndex;
        while (right < arr.length - 1 && arr[right + 1].getYear() == year) right++;
        for (int i = left; i <= right; i++)
            System.out.println("Found at index " + i + ": " + arr[i]);
    }

    public static void printAllMatchesByArtist(Music[] arr, int midIndex, String artist) {
        int left = midIndex;
        while (left > 0 && arr[left - 1].getArtist().equalsIgnoreCase(artist)) left--;
        int right = midIndex;
        while (right < arr.length - 1 && arr[right + 1].getArtist().equalsIgnoreCase(artist)) right++;
        for (int i = left; i <= right; i++)
            System.out.println("Found at index " + i + ": " + arr[i]);
    }

}
