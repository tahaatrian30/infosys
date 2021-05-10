package src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

abstract public class ReadCsv {

    List<List<String>> arr;
    String[] data;

    public void readCsv(String path) {
        try {
            BufferedReader csvReader = new BufferedReader(new FileReader(path));
            arr = new ArrayList<>();
            String row;
            while ((row = csvReader.readLine()) != null) {
                data = row.split(",");
                arr.add(Arrays.asList(data));
                System.out.println(Arrays.toString(data));
            }
            csvReader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
