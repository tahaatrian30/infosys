package src;

import java.io.IOException;
import java.util.List;

public class People extends Node {

    private String firs_name;
    private String last_name;
    private String Id_code;
    private String birth_date;
    private String city;
    private String job;

    public People() {
        Node_key = getId_code();
    }

    public People(String id_code) {
        Id_code = id_code;
        Node_key = getId_code();
    }

    public String getFirs_name() {
        return firs_name;
    }

    public void setFirs_name(String firs_name) {
        this.firs_name = firs_name;
    }


    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getId_code() {
        return Id_code;
    }

    public void setId_code(String id_code) {
        Id_code = id_code;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public void readCsv(String path){
        super.readCsv(path);
    }

}
