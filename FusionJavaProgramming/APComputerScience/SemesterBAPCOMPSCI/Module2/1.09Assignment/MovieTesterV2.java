public class MovieTesterV2 {
    public static void printMovies(MovieV2[] movies) {
        System.out.println("\n" + "============================================================");
        System.out.printf("%-30s %4s   %-20s%n", "TITLE", "YEAR", "STUDIO");
        System.out.println("============================================================");
        for(MovieV2 movie : movies) {
            System.out.println(movie);
        }
        System.out.println("============================================================" + "\n");
    }

    public static void sortByTitle(MovieV2[] movies, int order) {
        for(int i = 1; i < movies.length; i++) {
            MovieV2 key = movies[i];
            int j = i - 1;

            if(order == 1) {
                while(j >= 0 && movies[j].getTitle().compareToIgnoreCase(key.getTitle()) > 0) {
                    movies[j + 1] = movies[j];
                    j--;
                }
            } else if(order == 2) {
                while(j >= 0 && movies[j].getTitle().compareToIgnoreCase(key.getTitle()) < 0) {
                    movies[j + 1] = movies[j];
                    j--;
                }
            }
            movies[j + 1] = key;
        }
    }

    public static void sortByYear(MovieV2[] movies, int order) {
        for(int i = 1; i < movies.length; i++) {
            MovieV2 key = movies[i];
            int j = i -1;

            if(order == 1) {
                while(j >= 0 && movies[j].getYear() > key.getYear()) {
                    movies[j + 1] = movies[j];
                    j--;
                }
            } else if(order == 2) {
                while(j >= 0 &&movies[j].getYear() < key.getYear()) {
                    movies[j + 1] = movies[j];
                    j--;
                }
            }

            movies[j + 1] = key;
        }
    }

    public static void sortByStudio(MovieV2[] movies, int order) {
        for(int i = 1; i < movies.length; i++) {
            MovieV2 key = movies[i];
            int j = i - 1;

            if(order == 1) {
                while(j >= 0 && movies[j].getStudio().compareToIgnoreCase(key.getStudio()) > 0) {
                    movies[j + 1] = movies[j];
                    j--;
                }
            } else if(order == 2) {
                while(j >= 0 && movies[j].getStudio().compareToIgnoreCase(key.getStudio()) < 0) {
                    movies[j + 1] = movies[j];
                    j--;
                }
            }

            movies[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        MovieV2[] movies = {
            new MovieV2("Interstellar", 2014, "Paramount Pictures"),
            new MovieV2("The Good, the Bad, and the Ugly", 1966, "United Artists"),
            new MovieV2("Primer", 2004, "THINKFilm"),
            new MovieV2("Now You See Me", 2013, "Lionsgate"),
            new MovieV2("Ride Along", 2014, "Universal Pictures"),
            new MovieV2("Smokey and the Bandit", 1977, "Universal Pictures"),
            new MovieV2("You People", 2023, "Netflix"),
            new MovieV2("Rush Hour", 1998, "New Line Cinema"),
            new MovieV2("The Fast and the Furious", 2001, "Universal Pictures"),
            new MovieV2("Paul Blart: Mall Cop", 2009, "Columbia Pictures")
        };

        System.out.println("ORIGINAL MOVIE LIST:");
        printMovies(movies);

        sortByTitle(movies, 1);
        System.out.println("SORTED BY TITLE (ASCENDING):");
        printMovies(movies);

        sortByTitle(movies, 2);
        System.out.println("SORTED BY TITLE (DESCENDING):");
        printMovies(movies);

        sortByYear(movies, 1);
        System.out.println("SORTED BY YEAR (ASCENDING):");
        printMovies(movies);

        sortByYear(movies, 2);
        System.out.println("SORTED BY YEAR (DESCENDING):");
        printMovies(movies);

        sortByStudio(movies, 1);
        System.out.println("SORTED BY STUDIO (ASCENDING):");
        printMovies(movies);

        sortByStudio(movies, 2);
        System.out.println("SORTED BY STUDIO (DESCENDING):");
        printMovies(movies);
    }
}
