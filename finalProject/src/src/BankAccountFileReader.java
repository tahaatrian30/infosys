package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class BankAccountFileReader {

    private static int size = 0;
    static Map<String, List<String>> bankaccount_map = new HashMap<>();
    static Map<String, List<String>> bankaccount_map_id_key = new HashMap<>();
    static int number_of_accounts;
    static BankAccount[] bankAccounts;

    public static void makeFile() {
        String fileName = "D:\\data2\\accounts.csv";
        File file = new File(fileName);
        List<List<String>> list = new ArrayList<>();

        Scanner inputStream;
        try {
            inputStream = new Scanner(file);

            while (inputStream.hasNextLine()) {
                String line = inputStream.nextLine();
                String[] values = line.split(",");
                // this adds the currently parsed line to the 2-dimensional string array
                list.add(Arrays.asList(values));
                //System.out.println(Arrays.toString(values));
                size = values.length;
            }

            System.out.println(size);
            System.out.println(list.size());

            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        number_of_accounts = list.size() - 1;
        bankAccounts = new BankAccount[number_of_accounts];
        for (int i = 0; i < number_of_accounts; i++) {
            bankAccounts[i] = new BankAccount();
        }
        for (int i = 0; i < number_of_accounts; i++) {
            bankAccounts[i].setId_code(list.get(i).get(0));
            bankAccounts[i].setBank_name(list.get(i).get(1));
            bankAccounts[i].setAccount_number(list.get(i).get(2));
            bankAccounts[i].setShaba(list.get(i).get(3));
            //set key
            bankAccounts[i].setNode_key(list.get(i).get(3));

        }

        for (int i = 0; i < number_of_accounts; i++) {
            bankaccount_map_id_key.put(bankAccounts[i].getNode_key(), list.get(i));
        }

    }

    public static void main(String[] args) {

        System.out.println(findBankAccounts("\"76465777888\""));
    }

    public static List<String> findBankAccounts(String id){
        makeFile();
        List<String> arr=new ArrayList<>();
        for (int i = 0; i < number_of_accounts; i++) {
           // System.out.println(bankAccounts[i].getId_code());
            if(id.equals(bankAccounts[i].getId_code())){
                arr.add(bankAccounts[i].getShaba());
            }
        }
        return arr;
    }

    List<String> findPeopleByBankAccount(String shaba){
        List<String> arr=new ArrayList<>();
        for (int i = 0; i < number_of_accounts; i++) {
            if(shaba.equals(bankAccounts[i].getShaba())){
                arr.add(bankAccounts[i].getId_code());
            }
        }
        return arr;
    }
}
