public class index1 {
    static void pathRestriction(int r, int c, boolean[][] maze, String p) {

        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c])
        return;
        
        maze[r][c] = false;
        if (r < maze.length - 1)
            pathRestriction(r + 1, c, maze, p + 'D');
        if (r > 0)
            pathRestriction(r - 1, c, maze, p + 'U');
        

        if (c > 0)
            pathRestriction(r, c - 1, maze, p + 'L');
      

        if (c < maze[0].length - 1)
            pathRestriction(r, c + 1, maze, p + 'R');
          
        
        maze[r][c] = true;

    }

    public static void main(String[] args) {
        boolean[][] maze = {
                { true, true, true },
                { true, true, true },
                { true, true, true },
                
        };
        pathRestriction(0, 0, maze, "");
    }
}
