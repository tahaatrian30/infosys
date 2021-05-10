package src;

import java.io.IOException;

public class Home extends Node {

    private String id_code;
    private String price;
    private String post_code;
    private String meter;
    private String address;

    @Override
    public void readCsv(String path) {
        super.readCsv(path);
    }

    public Home(){
        Node_key =post_code;
    }
    public String getId_code() {
        return id_code;
    }

    public void setId_code(String id_code) {
        this.id_code = id_code;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPost_code() {
        return post_code;
    }

    public void setPost_code(String post_code) {
        this.post_code = post_code;
    }

    public String getMeter() {
        return meter;
    }

    public void setMeter(String meter) {
        this.meter = meter;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
