package ch.noseryoung.blj;

public class Fish {

    private String name;
    private String color;
    private int size;
    private String gender;
    private boolean isSaltWater;
    private String type;
    private int xPos;
    private int yPos;


    public Fish() {
    }

    public Fish(String name, String color, int size, String gender, boolean isSaltWater, String type, int xPos, int yPos) {
        this.name = name;
        this.color = color;
        this.size = size;
        this.gender = gender;
        this.isSaltWater = isSaltWater;
        this.type = type;
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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
