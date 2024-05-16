import java.awt.*;

public interface Printable {
    void draw(Graphics2D g2d, int fieldScale, int size);

    default CSPoint translatePoint(Point point, int fieldScale, int size) {
        return new CSPoint(point.x * fieldScale + size / 2, size / 2 - point.y * fieldScale);
    }
}
