import java.awt.*;

public class Starter {
    public static void main(String[] args) {

        CoordinateSystem cs = new CoordinateSystem(500);

        cs.addShape(new CSPoint(30, 60));

        new CSRenderer(cs, 1, 3);
    }
}