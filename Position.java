


/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveNorth() {
        y++;
    }

    public void moveSouth() {
        y--;
    }

    public void moveEast() {
        x++;
    }

    public void moveWest() {
        x--;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
