import java.util.ArrayList;
import java.util.List;

public class CoordinateSystem {

    private List<CSPoint> points = new ArrayList<CSPoint>();

    private List<CSLineSegment> lines = new ArrayList<CSLineSegment>();

    private int size;


    public void addLine(CSLineSegment line) {
        lines.add(line);
    }

    public void addLines(CSLineSegment... lines) {

    }

    public List<CSLineSegment> getAllLines() {
        return lines;
    }


    public CoordinateSystem(int size) {
        if (size <= 0 || size % 20 != 0) {
            throw new IllegalArgumentException("Your number needs to be greater than 0 and it must be possible to divide it by 20.");
        }

        this.size = size;
    }


    public void addPoint(CSPoint point) {
        points.add(point);
    }

    public List<CSPoint> getAllPoints() {
        return points;
    }


    public int getCoordinateSystemSize() {
        return size;
    }


}
