import java.awt.*;

public class CSPoint extends Point implements Printable {
    private static int count;
    private int id;

    public CSPoint(int x, int y) {
        super(x, y);

        this.id = ++count;
    }

    public CSPoint() {
        this(0, 0);
    }


    @Override
    public String toString() {
        return "ID=" + id + " X=" + x + " Y=" + y;
    }

    @Override
    public void draw(Graphics2D g2d, int fieldScale, int size) {
        CSPoint translatedPoint = translatePoint(this,fieldScale,size);
        g2d.setColor(Color.BLUE);
        g2d.drawLine(translatedPoint.x, translatedPoint.y, translatedPoint.x, translatedPoint.y);
    }
}
