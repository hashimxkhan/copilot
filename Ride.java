public class Ride {
    private String color; // the color of the ride
    private int maxRiders; // the maximum number of people that can go on the ride at once
    private int minHeight; // the minimum height in inches required to go on the ride
    private String name; // the name of the ride
    public Ride() {
        this.name = "";
        this.color = "";
        this.maxRiders = 0;
        this.minHeight = 0;
    }
    public Ride(String name, String color, int minHeight, int maxRiders) {
        this.name = name;
        this.color = color;
        this.maxRiders = maxRiders;
        this.minHeight = minHeight;
    }
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public int getMaxRiders() {
        return maxRiders;
    }
    public int getMinHeight() {
        return minHeight;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setMaxRiders(int maxRiders) {
        this.maxRiders = maxRiders;
    }
    public void setMinHeight(int minHeight) {
        this.minHeight = minHeight;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        String returnString = "Name: " + this.name + "\n" +
                "Color: " + this.color + "\n" +
                "MinHeight: " + this.minHeight + "\n" +
                "MaxRiders: " + this.maxRiders;
        return returnString;
    }
}
