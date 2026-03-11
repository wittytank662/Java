public class MusicTesterV1 {
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
        System.out.println("         FULL SONG LIST");
        System.out.println("========================================");
        printArray(songs);

        System.out.println("\n========================================");
        System.out.println("  SEARCH BY TITLE: \"Changes\"");
        System.out.println("========================================");
        int ans = searchByTitle(songs, "Changes");
        if (ans != -1) {
            System.out.println("Found at index " + ans + ": " + songs[ans]);
        } else {
            System.out.println("No song titled \"Changes\" was found.");
        }

        System.out.println("\n========================================");
        System.out.println("  SEARCH BY TITLE: \"STARGAZING\" (not found)");
        System.out.println("========================================");
        ans = searchByTitle(songs, "STARGAZING");
        if (ans != -1) {
            System.out.println("Found at index " + ans + ": " + songs[ans]);
        } else {
            System.out.println("No song titled \"STARGAZING\" was found.");
        }

        System.out.println("\n========================================");
        System.out.println("  SEARCH BY YEAR: 1996  (multiple matches)");
        System.out.println("========================================");
        searchByYear(songs, 1996);

        System.out.println("\n========================================");
        System.out.println("  SEARCH BY YEAR: 2025  (not found)");
        System.out.println("========================================");
        searchByYear(songs, 2025);

        System.out.println("\n========================================");
        System.out.println("  SEARCH BY ARTIST: \"Nas\"  (single match)");
        System.out.println("========================================");
        searchByArtist(songs, "Nas");

        System.out.println("\n========================================");
        System.out.println("  SEARCH BY ARTIST: \"Kanye West\"  (multiple matches)");
        System.out.println("========================================");
        searchByArtist(songs, "Kanye West");

        System.out.println("\n========================================");
        System.out.println("  SEARCH BY ARTIST: \"Taylor Swift\"  (not found)");
        System.out.println("========================================");
        searchByArtist(songs, "Taylor Swift");
        
    }

    public static void printArray(Music[] arr) {
        System.out.printf("%-25s %-6s %-20s%n","Title", "Year", "Artist");
        System.out.println("--------------------------------------------------");
        for (Music m : arr) {
            System.out.println(m);
        }
    }

    public static int searchByTitle(Music[] arr, String title) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            counter++;
            System.out.println("Counter: " + counter);
            if (arr[i].getTitle().equalsIgnoreCase(title))
                return i;
        } 
        return -1;
    }

    public static void searchByYear(Music[] arr, int year) {
        int counter = 0;
        int matches = 0;
        for (int i = 0; i < arr.length; i++) {
            counter++;
            System.out.println("Counter: " + counter);
            if (arr[i].getYear() == year) {
                System.out.println("Found at index " + i + ": " + arr[i]);
                matches++;
            }
        }
        if (matches == 0)
            System.out.println("No songs from the year \"" + year + "\" were found.");
    }

    public static void searchByArtist(Music[] arr, String artist) {
        int counter = 0;
        int matches = 0;
        for (int i = 0; i < arr.length; i++) {
            counter++;
            System.out.println("Counter: " + counter);
            if (arr[i].getArtist().equalsIgnoreCase(artist)) {
                System.out.println("Found at index " + i + ": " + arr[i]);
                matches++;
            }
        }
        if (matches == 0)
            System.out.println("No songs by \"" + artist + "\" were found.");
    }
}
