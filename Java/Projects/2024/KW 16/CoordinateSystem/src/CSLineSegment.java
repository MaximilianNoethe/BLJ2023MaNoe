import java.awt.*;

public class CSLineSegment {

    private CSPoint startPoint;
    private CSPoint endPoint;

    private Color color;

    public CSLineSegment(CSPoint startPoint, CSPoint endPoint, Color color) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.color = color;
    }


    public Color getColor() {
        return color;
    }

    public CSPoint getStartPoint() {
        return startPoint;
    }

    public CSPoint getEndPoint() {
        return endPoint;
    }

    @Override
    public String toString() {
        return "Start=" + startPoint + " End=" + endPoint;
    }

}
