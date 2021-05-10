package src;

import com.sun.org.apache.bcel.internal.generic.LUSHR;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class CallsFileReader {
    private static int size = 0;
    static Map<String, List<String>> bankaccount_map = new HashMap<>();
    static Map<String, List<String>> bankaccount_map_id_key = new HashMap<>();
    static int number_of_calls;
    static Call[] calls;

    public static void makeFile() {
        String fileName = "D:\\data2\\calls.csv";
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

        number_of_calls = list.size() - 1;
        calls = new Call[number_of_calls];
        for (int i = 0; i < number_of_calls; i++) {
            calls[i] = new Call();
        }
        for (int i = 0; i < number_of_calls; i++) {
            calls[i].setFrom(list.get(i).get(0));
            calls[i].setTo(list.get(i).get(1));
            calls[i].setId(list.get(i).get(2));
            calls[i].setDuration(list.get(i).get(3));
            //set key
            calls[i].setMane_key(list.get(i).get(2));
        }

        for (int i = 0; i < number_of_calls; i++) {
            bankaccount_map_id_key.put(calls[i].getMane_key(), list.get(i));
        }

    }


    public static List<String> callfromSmuglerToSuspect(String from,String to) {
        List<String> list=new ArrayList<>();

        for (int i = 0; i < number_of_calls; i++) {
            if (from.equals(calls[i].getFrom()) && to.equals(calls[i].getTo())){
                list.add(calls[i].getTo());
            }
        }
        return  list;
    }
}