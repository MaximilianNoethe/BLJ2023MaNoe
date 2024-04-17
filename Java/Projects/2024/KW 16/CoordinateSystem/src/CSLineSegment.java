public class CSLineSegment {

    public CSPoint startPoint;
    public CSPoint endPoint;

    public CSLineSegment(CSPoint startPoint, CSPoint endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public CSPoint getStartPoint() {
        return startPoint;
    }

    public CSPoint getEndPoint() {
        return endPoint;
    }

    @Override
    public String toString() {
        return "Start=" + startPoint + " End=" + endPoint;
    }
}
