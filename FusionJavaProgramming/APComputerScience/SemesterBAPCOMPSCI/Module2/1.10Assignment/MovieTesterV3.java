public class MovieTesterV3 {
    public static void printMovies(Movie[] movies) {
        System.out.println("\n" + "===============================================================");
        System.out.printf("%-33s %4s   %-20s%n", "TITLE", "YEAR", "STUDIO");
        System.out.println("===============================================================");
        for(Movie movie : movies) {
            System.out.println(movie);
        }
        System.out.println("===============================================================" + "\n");
    }

    public static void sortByTitle(Movie[] movies, int order) {
        int n = movies.length;
        for(int i = 0; i < n; i++) {
            int key = i;

            if(order == 1) {
                for(int j = i + 1; j < n; j++) {
                    if(movies[j].getTitle().compareToIgnoreCase(movies[key].getTitle()) > 0) {
                        key = j;
                    }
                }
            } else if(order == 2) {
                for(int j = i + 1; j < n; j++) {
                    if(movies[j].getTitle().compareToIgnoreCase(movies[key].getTitle()) < 0) {
                        key = j;
                    }
                }
            }
            Movie tempMovie = movies[i];
            movies[i] = movies[key];
            movies[key] = tempMovie;
        }
    }

    public static void sortByYear(Movie[] movies, int order) {
        int n = movies.length;
        for(int i = 0; i < n; i++) {
            int key = i;

            if(order == 1) {
                for(int j = i + 1; j < n; j++) {
                    if(movies[j].getYear() > movies[key].getYear()) {
                        key = j;
                    }
                }
            } else if(order == 2) {
                for(int j = i + 1; j < n; j++) {
                    if(movies[j].getYear() < movies[key].getYear()) {
                        key = j;
                    }
                }
            }
            Movie tempMovie = movies[i];
            movies[i] = movies[key];
            movies[key] = tempMovie;
        }
    }

    public static void sortByStudio(Movie[] movies, int order) {
        int n = movies.length;
        for(int i = 0; i < n; i++) {
            int key = i;

            if(order == 1) {
                for(int j = i + 1; j < n; j++) {
                    if(movies[j].getStudio().compareToIgnoreCase(movies[key].getStudio()) > 0) {
                        key = j;
                    }
                }
            } else if(order == 2) {
                for(int j = i + 1; j < n; j++) {
                    if(movies[j].getStudio().compareToIgnoreCase(movies[key].getStudio()) < 0) {
                        key = j;
                    }
                }
            }
            Movie tempMovie = movies[i];
            movies[i] = movies[key];
            movies[key] = tempMovie;
        }
    }

    public static void main(String[] args) {
        Movie[] movies = {
            new Movie("Interstellar", 2014, "Paramount Pictures"),
            new Movie("The Good, the Bad, and the Ugly", 1966, "United Artists"),
            new Movie("Primer", 2004, "THINKFilm"),
            new Movie("Now You See Me", 2013, "Lionsgate"),
            new Movie("Ride Along", 2014, "Universal Pictures"),
            new Movie("Smokey and the Bandit", 1977, "Universal Pictures"),
            new Movie("You People", 2023, "Netflix"),
            new Movie("Rush Hour", 1998, "New Line Cinema"),
            new Movie("The Fast and the Furious", 2001, "Universal Pictures"),
            new Movie("Paul Blart: Mall Cop", 2009, "Columbia Pictures")
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
