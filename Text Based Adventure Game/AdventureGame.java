import java.io.IOException;
import java.util.Scanner;

public class AdventureGame {
    public static void main(String[] args) {
        // Load map
        char[][] map = null;

        try {
            map = AdventureGameSetup.loadMap("Map.txt");
        } catch (IOException e) {
            System.out.println("Failed to load map file!");
            return;
        }

        Scanner myObj = new Scanner(System.in);

        AdventureGameCharacter player = new AdventureGameCharacter("Sam", 20, 100, 0, 0, map);

        Boolean loop = true;
        String input;

        while(loop == true) {
            System.out.print("Do you want to go N-S-E-W? or check location C?");
            input = myObj.nextLine();

            switch (input) {
                case "N" -> player.moveUp(map);
                case "S" -> player.moveDown(map);
                case "E" -> player.moveRight(map);
                case "W" -> player.moveLeft(map);
                case "C" -> {
                    System.out.println(player.getCol());
                    System.out.println(player.getRow());
                    System.out.println(player.getTile());
                }
                default -> {
                }
            }
        }
    }
}
