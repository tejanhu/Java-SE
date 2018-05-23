public abstract class Watch {
    String name;
    String color;
    String size;
    int noHands = 2;
    boolean handsMoving;
    String time = "";
    boolean isWorking;

    public Watch(boolean isWorking, String name) {
        this.color = color;
        this.size = size;
        this.time = time;
        this.name = name;
        this.isWorking = isWorking;
        this.noHands = noHands;
    }

    /*
        SWITCH-CASE STATEMENT SETS THE SIZE OF THE WATCH
     */

    public void setSize(String size) {
        if (size.equals("small") || size.equals("s")) {
            this.size = "Small";
        } else if (size.equals("x-small") || size.equals("xs")) {
            this.size = "Extra-Small";
        } else if (size.equals("medium") || size.equals("m")) {
            this.size = "Medium";
        } else if (size.equals("large") || size.equals("l"))
            this.size = "Large";

        else if (size.equals("x-large") || size.equals("xl")) {
            this.size = "XL";
        } else if (size.equals("xx-large") || size.equals("xxl")) {
            this.size = "XXL";
        } else if (size.equals("xxx-large") || size.equals("xxxl")) {
            this.size = "XXXL";
        }
    }

    public String getSize() {

        return size;
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


    public int getNoHands() {
        return noHands;
    }

    public boolean checkIfHandsMoving() {
        return handsMoving;
    }

    public void setHandsMoving(boolean handsMoving) {
        if (!die()) {
            this.handsMoving = true;
        } else {
            this.handsMoving = false;
        }
    }

    public String getTime() {
        if (checkIfHandsMoving()) {
            return time;
        }
        return "BATTERY DEAD!";
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setWorking(boolean isWorking) {
        this.isWorking = isWorking;
    }


    public boolean die() {
        return isWorking;
    }


}
