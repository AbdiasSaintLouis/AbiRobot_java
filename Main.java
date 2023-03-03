public class Main{

public static void main(String []args){
    Position p = new Position(0, 0);
    p.moveNorth();
    p.moveEast();
    System.out.println("New position: (" + p.getX() + ", " + p.getY() + ")");
    }
}