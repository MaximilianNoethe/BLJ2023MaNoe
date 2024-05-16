import java.awt.*;

public class Starter {
    public static void main(String[] args) {

        CoordinateSystem cs = new CoordinateSystem(500);

        cs.addShape(new CSPoint(30, 60));


        /*cs.addPoint(new CSPoint(30, 60));

        cs.addLine(new CSLineSegment(new CSPoint(59, 10), new CSPoint(-84, 72), Color.MAGENTA));*/

        new CSRenderer(cs, 1, 3);
    }
}