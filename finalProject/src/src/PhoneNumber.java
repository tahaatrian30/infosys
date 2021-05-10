package src;

import java.io.IOException;

public class PhoneNumber extends Node {

    private String id_code;
    private String number;
    private String operator;
    @Override
    public void readCsv(String path) {
        super.readCsv(path);
    }
    public PhoneNumber(){
        Node_key =number;
    }
    public String getId_code() {
        return id_code;
    }

    public void setId_code(String id_code) {
        this.id_code = id_code;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
