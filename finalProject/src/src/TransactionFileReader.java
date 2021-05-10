package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TransactionFileReader {
    static List<List<String>> list;
    static String[] values;
    static int number_of_transactions;
    static Transaction[] transaction;
    private static int size = 0;

    public static void makeFile() {
        String fileName = "D:\\data2\\transactions.csv";
        File file = new File(fileName);
         list = new ArrayList<>();

        Scanner inputStream;
        try {
            inputStream = new Scanner(file);

            while (inputStream.hasNextLine()) {
                String line = inputStream.nextLine();
                values = line.split(",");
                // this adds the currently parsed line to the 2-dimensional string array
                list.add(Arrays.asList(values));
                size = values.length;
            }

            inputStream.close();
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        }

         number_of_transactions = list.size() - 1;
        transaction = new Transaction[number_of_transactions];
        for (int i = 0; i < number_of_transactions; i++) {
            transaction[i] = new Transaction();
        }

        for (int i = 0; i < number_of_transactions; i++) {
            transaction[i].setShaba_from(list.get(i).get(0));
            transaction[i].setShaba_to(list.get(i).get(1));
            transaction[i].setId(list.get(i).get(2));
            //set key az transaction id
            transaction[i].setMane_key(list.get(i).get(2));
            transaction[i].setTime(list.get(i).get(3));
            transaction[i].setPrice(list.get(i).get(4));
        }

        //map for storing key with the rest data as value
        Map<String,List<String>> Transaction_map =new HashMap<>();
        for (int i = 0; i < number_of_transactions; i++) {
            Transaction_map.put(transaction[i].getMane_key(), list.get(i));
        }
        /*System.out.println(transaction[2].getMane_key());
        System.out.println(Transaction_map.get(transaction[2].getMane_key()));*/

    }

    public static void main(String[] args) {
        System.out.println(findTransaction("754062"));
        int last_arr=findTransaction("754062").size()-1;
        if(findTransaction("754062").get(last_arr).equals("111111")){
            System.out.println("oa");
        }else{
            System.out.println("asdfd");
        }
    }

    public static List<String> findTransaction(String shaba_from){
        makeFile();
        List<String> arr=new ArrayList<>();
        int counter=0;
        for (int i = 0; i < number_of_transactions; i++) {
            if(shaba_from.equals(transaction[i].getShaba_from())){
                //inja bayad chi brizim???
                arr.add(transaction[i].getShaba_to());
                System.out.println(shaba_from=transaction[i].getShaba_to());
                counter++;
                i=0;
                if(counter<=5){
                    continue;
                }else{
                    break;
                }
            }
        }
        return arr;
    }
}
