public class Compass extends Watch {
    int distance;

    public Compass(boolean isWorking, String name) {
        super(isWorking, name);
        this.noHands = 4;
        this.distance = distance;
    }

    public String getTime() {
        return "TIME NOT SUPPORTED!";
    }

    public void setTime(String time) {
        time = null;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
