package models;
import java.util.ArrayList;
public class Shape {

    private final ArrayList<models.Point> array;
    public Shape() {
        array = new ArrayList<>();
    }

    public void addPoint(models.Point point) {
        array.add(point);
    }


    public double calculatePerimeter() {
        double per = 0;
        int size = array.size();

        for(int i = 0; i < size - 1; i++) {
            per += array.get(i).distanceTo(array.get(i + 1));
        }
        per += array.get(size - 1).distanceTo(array.get(0));
        return per;
    }

    public double getAverageSide() {
        return calculatePerimeter() / 10;
    }

    public double getLongestSide() {
        double max = 0;
        double current;
        for(int i = 0; i < 9; i++) {
            current = array.get(i).distanceTo(array.get(i + 1));
            if(current > max) {
                max = current;
            }
        }
        current = array.get(0).distanceTo(array.get(9));
        if(current > max) {
            max = current;
        }
        return max;
    }
}