import javafx.scene.shape.Line;
import javafx.scene.paint.Color;

public class MyLine extends Line {
    public MyLine(double startX, double startY, double endX, double endY) {
        super(startX, startY, endX, endY);
        setStroke(Color.BLACK); // Set the line color
    }
}
