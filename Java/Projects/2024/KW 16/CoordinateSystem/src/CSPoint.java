import java.awt.Point;

public class CSPoint extends Point {
    private static int count;
    private int id;


    public CSPoint(int x, int y) {
        super(x, y);

        this.id = ++count;
    }

    public CSPoint() {
        this(0, 0);
        this.id = ++count;
    }


    @Override
    public String toString() {
        return "ID=" + id + " X=" + x + " Y=" + y;
    }

}
