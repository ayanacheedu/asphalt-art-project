import org.code.neighborhood.*;
public class PainterPlus extends Painter {

// Level 7A: Picks up all the paint if the painter is standing on multiple buckets
  public void takeAllPaint() {
    while (isOnBucket()) {
      takePaint();
    }
  }

  // Level 7B: Move Fast
  public void moveFast(){
    while(canMove()) {
      move();
    }
  }
  // Level 7C: Paint to Empty
  public void paintToEmpty(String color){
    while(hasPaint()) {
      paint(color);
      move();
    }
  }
  // Level 7D: Paints a donut (3x3 with center no color)
  public void paintDonut(String color) {
    while (hasPaint()) {
      move();
      turnRight();
      paint(color);
      move();
      paint(color);
    }
  }
  
  // Level 6: Turns the painter to the right (3 lefts)
  public void turnRight() {
    turnLeft();
    turnLeft();
    turnLeft();
  } 
}
