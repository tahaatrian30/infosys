package src;

import java.io.IOException;

public class Contact extends Mane {

    private String phone_number_from;
    private String phone_number_to;
    private String call_id;
    private String date;
    private String Duration;
    private String mane_key;


    public Contact(){
        mane_key= phone_number_from;
    }
    public String getPhone_number_from() {
        return phone_number_from;
    }

    public void setPhone_number_from(String phone_number_from) {
        this.phone_number_from = phone_number_from;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String duration) {
        this.Duration = duration;
    }

    public String getMane_key() {
        return mane_key;
    }

    public void setMane_key(String mane_key) {
        this.mane_key = mane_key;
    }

    public String getPhone_number_to() {
        return phone_number_to;
    }

    public void setPhone_number_to(String phone_number_to) {
        this.phone_number_to = phone_number_to;
    }

    public String getCall_id() {
        return call_id;
    }

    public void setCall_id(String call_id) {
        this.call_id = call_id;
    }
}

