public class Starter {
    public static void main(String[] args) {


        CoordinateSystem cs = new CoordinateSystem(500);

        cs.addPoint(new CSPoint(30, 60));

        cs.addLine(new CSLineSegment(new CSPoint(34, 62), new CSPoint(-34, 22)));


        new CSRenderer(cs, 1, 3);
    }
}
