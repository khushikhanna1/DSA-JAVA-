package lecture17;

public class RatInAMazeCount {
    static int[][] ans = new int[100][100];

    static void display(int x, int y) {
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= y; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean findCheese(int[][] maze, int i, int j, int x, int y) {
        if (i == x && j == y) {
            ans[i][j] = 1;
            return true;
        }

        // Mark the current location
        ans[i][j] = 1;

        if (i <= x) {
            // Move down
            if (findCheese(maze, i + 1, j, x, y))
                return true;

            // Move right
            if (findCheese(maze, i, j + 1, x, y))
                return true;
        }

        // Backtrack
        ans[i][j] = 0;
        return false;
    }

    public static void main(String[] args) {
        int[][] maze = {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0}
        };

        int x = 3, y = 4; // Position of cheese
        int i = 0, j = 0; // Starting position of mouse

        findCheese(maze, i, j, x, y);
        display(x, y);
    }
}


