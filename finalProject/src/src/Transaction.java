package src;


import java.io.IOException;

public class Transaction extends Mane {

    @Override
    public void readCsv(String path) {
        super.readCsv("E:\\data2\\transactions.csv");
    }
    private String shaba_from;
    private String shaba_to;
    private String time;
    private String id;
    private String price;
    private String mane_key;

    public Transaction(){
        mane_key= id;
    }


    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getMane_key() {
        return mane_key;
    }

    public void setMane_key(String mane_key) {
        this.mane_key = mane_key;
    }

    public String getShaba_from() {
        return shaba_from;
    }

    public void setShaba_from(String shaba_from) {
        this.shaba_from = shaba_from;
    }

    public String getShaba_to() {
        return shaba_to;
    }

    public void setShaba_to(String shaba_to) {
        this.shaba_to = shaba_to;
    }
}
