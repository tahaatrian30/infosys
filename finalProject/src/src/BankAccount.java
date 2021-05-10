package src;

import java.io.IOException;

public class BankAccount extends Node {

    private String id_code;
    private String bank_name;
    private String shaba;
    private String account_number;

    @Override
    public void readCsv(String path)  {
        super.readCsv(path);
    }

    public BankAccount() {
        Node_key =shaba;
    }

    public String getId_code() {
        return id_code;
    }

    public void setId_code(String id_code) {
        this.id_code = id_code;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getShaba() {
        return shaba;
    }

    public void setShaba(String shaba) {
        this.shaba = shaba;
    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }
}
