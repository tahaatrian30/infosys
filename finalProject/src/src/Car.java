package src;

import java.io.IOException;

public class Car extends Node {

    private String pelak_number;
    private String id_code;
    private String model;
    private String color;

    @Override
    public void readCsv(String path) {
        super.readCsv("E:\\data2\\cars.csv");
    }

    public Car(){
        Node_key =pelak_number;
    }
    public String getPelak_number() {
        return pelak_number;
    }

    public void setPelak_number(String pelak_number) {
        this.pelak_number = pelak_number;
    }

    public String getId_code() {
        return id_code;
    }

    public void setId_code(String id_code) {
        this.id_code = id_code;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
