package aspectj.demo05;

import figures.Point;

import java.util.ArrayList;
import java.util.List;

public aspect PointObserving {

    // Class Point have no field: observers
    // However, it can declare here.
    // observers: Store the change point position.
    private List<Point> Point.observers = new ArrayList<Point>();

    pointcut moveAction(Point point): call(void Point.move(int,int) )
            && target(point)
            && within(aspectj.demo05.PointObservingTest);

    after(Point point): moveAction(point)  {
        System.out.println("Point moved");
        // add new position
        point.observers.add(point);

        // Print the location of the point went through.
        System.out.println(" - " + point.observers);
    }

    public static void addObserver(Point p) {
        // p.observers.add(s);
    }

    public static void removeObserver(Point p) {
        // p.observers.remove(s);
    }
}