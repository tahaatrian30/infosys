package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class RelationShipFileReader {

    private static int size = 0;
    static RelationShip[] relationShips;
    static int number_of_relationships;

    public void makeFile(){
        String fileName = "D:\\data2\\relationships.csv";
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
               // System.out.println(Arrays.toString(values));
                size = values.length;
            }

           // System.out.println(size);
           // System.out.println(list.size());

            inputStream.close();
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        }

        number_of_relationships = list.size() - 1;
        relationShips = new RelationShip[number_of_relationships];
        for (int i = 0; i < number_of_relationships; i++) {
            relationShips[i] = new RelationShip();
        }

        for (int i = 0; i < number_of_relationships; i++) {
            relationShips[i].setId_code_from(list.get(i).get(0));
            relationShips[i].setId_code_to(list.get(i).get(1));
            relationShips[i].setRelation_type(list.get(i).get(2));
            //key data set (combine of two id codes
            relationShips[i].setMane_key(list.get(i).get(0) + list.get(i).get(1));
            relationShips[i].setRelation_start_time(list.get(i).get(3));
        }

        //map for storing key with the rest data as value
        Map<String, List<String>> RelationShip_map = new HashMap<>();
        for (int i = 0; i < number_of_relationships; i++) {
            RelationShip_map.put(relationShips[i].getMane_key(), list.get(i));
        }
    }


     List<String> getFirstRelations(String id) {
        List<String> arr_from = new ArrayList<>();
//        List<String> arr_to = new ArrayList<>();
        for (int i = 0; i < number_of_relationships; i++) {
            if (id.equals(relationShips[i].getId_code_from())) {
                arr_from.add(relationShips[i].getId_code_to());
            }
//            else if (id.equals(relationShips[i].getId_code_to())) {
//                arr_from.add(relationShips[i].getId_code_from());
//            }
        }
        return arr_from;
    }
}
