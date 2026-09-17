import org.code.neighborhood.*;
public class ColorPainter extends OutlinePainter {
// Paints the current square, then moves and paints two more times in a row
public void paintThree() {
paint("pink");
moveAndPaint("pink");
moveAndPaint("pink");
}
public void paintInside() {
// Turn left and move all the way to the edge of the grid
turnLeft();
while (canMove()) {
move();
}
turnLeft();
while (canMove()) {
move();
}
//Position painter
turnLeft();
move();
move();
move();
turnLeft();
move();
//Paint the first section
paintThree();
move();
move();
move();
move();
paintThree();
//Pivot
turnRight();
move();
turnRight();
//Paint the second section
paint("pink");
move();
paint("pink");
move();
move();
move();
paint("pink");
move();
move();
move();
paint("pink");
move();
paint("pink");
//Turn around and continue painting
turnLeft();
move();
paint("pink");
turnLeft();
move();
paint("pink");
move();
paint("pink");
move();
move();
move();
move();
paintThree();
//Move to inner rows
turnRight();
move();
turnRight();
move();
move();
move();
paint("pink");
move();
move();
paint("pink");
turnLeft();
move();
paint("pink");
turnRight();
move();
paint("pink");
turnLeft();
move();
paint("pink");
turnRight();
paint("pink");
move();
paint("pink");
turnLeft();
move();
paint("pink");
//Reposition for final details
turnLeft();
move();
move();
move();
move();
turnLeft();
move();
move();
move();
turnRight();
turnRight();
move();
paint("pink");
turnLeft();
move();
//Finish painting bottom half
paint("pink");
turnRight();
move();
paint("pink");
turnLeft();
move();
paint("pink");
turnRight();
move();
paint("pink");
}
}