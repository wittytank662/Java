import java.io.*;

public class AdventureGameSetup {
    public static final int ROWS = 25;
    public static final int COLS = 15;

    public static char[][] loadMap(String fileName) throws IOException {
        char[][] map = new char[ROWS][COLS];

        BufferedReader reader = new BufferedReader(new FileReader("Map.txt"));
        String line;
        int row = 0;

        while ((line = reader.readLine()) != null && row < ROWS) {
            line = line.replace("[", "").replace("]", "").trim();

            String[] cells = line.split("\\s+");

            for (int col = 0; col < COLS; col++) {
                map[row][col] = cells[col].charAt(0);
            }
            row++;
        }

        reader.close();
        return map;
    }
}
