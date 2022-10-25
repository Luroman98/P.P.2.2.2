package web.model;

import java.util.ArrayList;

public class Car {
    private String model;
    private String color;
    private int series;

public Car(String model, String color, int series) {
        this.model = model;
        this.color = color;
        this.series = series;
    }


    public ArrayList<Car> listCars = new ArrayList<>();


    public Car() {
    }
}
