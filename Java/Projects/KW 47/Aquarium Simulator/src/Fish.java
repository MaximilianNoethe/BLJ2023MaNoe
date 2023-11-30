public class Fish {

    private String name;
    private String type;
    private int xPos;
    private int yPos;
    private boolean isSaltWater;

    public Fish() {
    }

    public Fish(String name, String type, int xPos, int yPos, boolean isSaltWater) {
        this.name = name;
        this.type = type;
        this.xPos = xPos;
        this.yPos = yPos;
        this.isSaltWater = isSaltWater;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSaltWater() {
        return isSaltWater;
    }

    public void setSaltWater(boolean saltWater) {
        isSaltWater = saltWater;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }
}
