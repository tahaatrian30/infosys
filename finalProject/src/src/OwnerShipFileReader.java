package src;

import org.w3c.dom.ls.LSInput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class OwnerShipFileReader {

    int size = 0;
    Ownership[] ownership;
    int number_of_ownership;
    Map<String, List<String>> ownership_map;
    List<String> id;

    public void makeFile() {
        String fileName = "D:\\data2\\ownerships.csv";
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
                //  System.out.println(Arrays.toString(values));
                size = values.length;
            }
            inputStream.close();
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        }

        number_of_ownership = list.size() - 1;
        ownership = new Ownership[number_of_ownership];
        for (int i = 0; i < number_of_ownership; i++) {
            ownership[i] = new Ownership();
        }

        for (int i = 0; i < number_of_ownership; i++) {
            ownership[i].setFrom(list.get(i).get(0));
            ownership[i].setTo(list.get(i).get(1));
            ownership[i].setDoc_number(list.get(i).get(2));
            ownership[i].setMane_key(list.get(i).get(2));
            ownership[i].setDate(list.get(i).get(3));
            ownership[i].setPrice(list.get(i).get(4));
        }

        //map for storing key with the rest data as value
        ownership_map = new HashMap<>();
        for (int i = 0; i < number_of_ownership; i++) {
            ownership_map.put(ownership[i].getMane_key(), list.get(i));
        }


    }

    int getOwnershipList(String id) {
        List<String> arr = new ArrayList<>();
        int flag=0;
        for (int i = 0; i < number_of_ownership; i++) {
            if (id.equals(ownership[i].getFrom())) {
                if(2020-Integer.parseInt(ownership[i].getDate().substring(1,5))<=2) {
//                        System.out.println(2000-Integer.parseInt(ownership[i].getDate().substring(1,5)));
//                        System.out.println(Integer.parseInt(ownership[i].getDate().substring(1,5)));
//                        System.out.println(ownership[i].getDate());
//                        System.out.println(ownership[i].getDoc_number());
//                        System.out.println(ownership[i].getFrom());
//                        System.out.println(ownership[i].getTo());
                    flag=1;
                    break;
                }
            }
        }
        return flag;
    }
    List<String> getdaraee(String id) {
        List<String> arr = new ArrayList<>();

        for (int i = 0; i < number_of_ownership; i++) {
            if (id.equals(ownership[i].getFrom())) {
//                if(2020-Integer.parseInt(ownership[i].getDate().substring(1,5))<=6) {
//                        System.out.println(2000-Integer.parseInt(ownership[i].getDate().substring(1,5)));
//                        System.out.println(Integer.parseInt(ownership[i].getDate().substring(1,5)));
//                        System.out.println(ownership[i].getDate());
//                        System.out.println(ownership[i].getDoc_number());
//                        System.out.println(ownership[i].getFrom());
//                        System.out.println(ownership[i].getTo());
                    arr.add(ownership[i].getMane_key());
//                }
            }
        }

        return arr;
    }
}
