package src;

import java.io.IOException;

public class Phase1 {
    public static void main(String[] args) throws IOException {

        System.out.println("Peoples Data: -------------------------------------------------------------------");

        People people=new People();
        people.readCsv("E:\\data2\\people.csv");

        System.out.println("Relationships Data: -------------------------------------------------------------------");

        RelationShip relationShip=new RelationShip();
        relationShip.readCsv("E:\\data2\\relationships.csv");

        System.out.println("BankAccount Data: -------------------------------------------------------------------");

        BankAccount bankAccount=new BankAccount();
        bankAccount.readCsv("E:\\data2\\accounts.csv");

        System.out.println("Transaction Data: -------------------------------------------------------------------");

        Transaction transaction=new Transaction();
        transaction.readCsv("E:\\data2\\transactions.csv");

        System.out.println("Homes Data: -------------------------------------------------------------------");

        Home home=new Home();
        home.readCsv("E:\\data2\\homes.csv");

        System.out.println("Cars Data: -------------------------------------------------------------------");

        Car car=new Car();
        car.readCsv("E:\\data2\\cars.csv");

        System.out.println("ownership Data: -------------------------------------------------------------------");

        Ownership ownership=new Ownership();
        ownership.readCsv("E:\\data2\\ownerships.csv");

        System.out.println("PhoneNumber Data: -------------------------------------------------------------------");

        PhoneNumber phoneNumber=new PhoneNumber();
        phoneNumber.readCsv("E:\\data2\\phones.csv");

        System.out.println("contact Data: -------------------------------------------------------------------");

        Contact contact=new Contact();
        contact.readCsv("E:\\data2\\calls.csv");

    }
}
