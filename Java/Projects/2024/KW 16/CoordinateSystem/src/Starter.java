import java.awt.*;

public class Starter {
    public static void main(String[] args) {

        CoordinateSystem cs = new CoordinateSystem(500);

        cs.addPoint(new CSPoint(30, 60));

        cs.addLine(new CSLineSegment(new CSPoint(34, 62), new CSPoint(-34, 22), Color.BLACK));
        cs.addLine(new CSLineSegment(new CSPoint(59, 10), new CSPoint(-84, 72), Color.MAGENTA));

        new CSRenderer(cs, 1, 3);
    }
}