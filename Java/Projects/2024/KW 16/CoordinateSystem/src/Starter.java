import java.awt.*;

public class Starter {
    public static void main(String[] args) {

        CoordinateSystem cs = new CoordinateSystem(500);

        cs.addPoint(new CSPoint(30, 60));

        cs.addLine(new CSLineSegment(new CSPoint(34, 62), new CSPoint(-34, 22), Color.BLACK));
        cs.addLine(new CSLineSegment(new CSPoint(59, 10), new CSPoint(-84, 72), Color.MAGENTA));
        cs.addLine(new CSLineSegment(new CSPoint(82, 73), new CSPoint(-34, 22), Color.BLACK));
        cs.addLine(new CSLineSegment(new CSPoint(94, 2), new CSPoint(-34, 22), Color.BLACK));
        cs.addLine(new CSLineSegment(new CSPoint(100, -96), new CSPoint(-34, 22), Color.BLACK));



        new CSRenderer(cs, 1, 3);
    }
}