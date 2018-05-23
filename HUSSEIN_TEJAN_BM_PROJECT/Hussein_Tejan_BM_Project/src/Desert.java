import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Map;

public class Desert {


    String desertName;
    int length;
    int width;
    int area;
    int[][] riverLocation;
    String exitSteps;
    int noOasis;

    public Desert() {
        this.length = length;
        this.width = width;
        this.desertName = desertName;
        this.noOasis = noOasis;
        this.riverLocation = riverLocation;
        exitSteps = "";
    }

    public String getDesertName() {
        return desertName;
    }

    public void setDesertName(String desertName) {
        this.desertName = desertName;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = length * width;
    }

    public int getNoOasis() {
        return noOasis;
    }

    public void setNoOasis(int noOasis) {
        this.noOasis = noOasis;
    }

    /*

              Coordinates in the Desert - containing the location of all Oasis and the EXIT i.e.: The Riverbanks
              Purpose: sets the position where in the desert, one can find the River banks i.e.: coordinates where the exit is located


    public void setRiverLocation(int riverLocation[][]) {


        int coordinates[][] = {
                {0, 0}, {0, 1}, {0, 2}, {0, 3}, {0, 4},
                {1, 0}, {1, 1}, {1, 2}, {1, 3}, {1, 4},
                {2, 0}, {2, 1}, {2, 2}, {2, 3}, {2, 4},
                {3, 0}, {3, 1}, {3, 2}, {3, 3}, {3, 4},
                {4, 0}, {4, 1}, {4, 2}, {4, 3}, {4, 4}
        };

//       this.riverLocation = coordinates[1][4];

    }

    public int[][] getRiverLocation() {
        return riverLocation;
    }

     */

    public void setSteps() {
        this.exitSteps = exitSteps;
    }

    public String getSteps() {
        return exitSteps;
    }


}
