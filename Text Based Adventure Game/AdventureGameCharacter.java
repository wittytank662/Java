public class AdventureGameCharacter {
    private String name;
    private int age;
    private double weight;
    private int inventorySpace = 4;
    private char[][] map;
    private int row;
    private int col;

    public AdventureGameCharacter(String name, int age, double weightlbs, int startRow, int startCol, char[][] map) {
        this.name = name;
        this.age = age;
        this.weight = weightlbs;
        this.row = startRow;
        this.col = startCol;
        this.map = map;
    }

    public void moveUp(char[][] map) {
        if (row > 0 && map[row - 1][col] != 'M') {
            row--;
        }
    }

    public void moveDown(char[][] map) {
        if (row < map.length - 1 && map[row +1][col] != 'M') { 
            row++;
        } 
    }

    public void moveLeft(char[][] map) {
        if (col > 0 && map[row][col - 1] != 'M') {
            col--;
        }
    }

    public void moveRight(char[][] map) {
        if (col < map[0].length - 1 && map[row][col + 1] != 'M') {
            col++;
        }
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public char getTile() {
        return map[row][col];
    }
}