import java.util.ArrayList;
import java.util.List;

public class CoordinateSystem {


    private ArrayList<Printable> shapes = new ArrayList<>();
    private List<CSPoint> points = new ArrayList<CSPoint>();
    private List<CSLineSegment> lines = new ArrayList<CSLineSegment>();

    private int size;

    // Shapes
    public void addShape(Printable shape) {
        shapes.add(shape);
    }

    public ArrayList<Printable> getAllShapes() {
        return shapes;
    }

    // Lines
    public void addLine(CSLineSegment line) {
        lines.add(line);
    }

    public List<CSLineSegment> getAllLines() {
        return lines;
    }

    // Points
    public void addPoint(CSPoint point) {
        points.add(point);
    }

    public List<CSPoint> getAllPoints() {
        return points;
    }

    // Coordinate-system
    public CoordinateSystem(int size) {
        if (size <= 0 || size % 20 != 0) {
            throw new IllegalArgumentException("Your number needs to be greater than 0 and it must be possible to divide it by 20.");
        }

        this.size = size;
    }

    public int getCoordinateSystemSize() {
        return size;
    }


}
