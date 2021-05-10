package src;

import java.io.IOException;

public class Ownership extends Mane {
    private  String mane_key;
    private String doc_number;
    private String date;
    private String price;

    private String from;
    private String to;

    public static boolean is_owned=false;

    public Ownership(){
        mane_key=doc_number;
        is_owned=true;
    }


    public String getMane_key() {
        return mane_key;
    }

    public void setMane_key(String mane_key) {
        this.mane_key = mane_key;
    }

    public void setDoc_number(String doc_number) {
        this.doc_number = doc_number;
    }

    public String getDoc_number(){
        return doc_number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String time) {
        this.date = time;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
