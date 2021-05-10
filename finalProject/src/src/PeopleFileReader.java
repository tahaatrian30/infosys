package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class PeopleFileReader {
    private static int size = 0;
    private static int number_of_people;
    private static List<List<String>> lists;
    private static People[] people;
    Hashtable<String, List<String>> people_map = new Hashtable<>();


    public void makeFile() {
        String fileName = "C:\\Users\\Taha\\Desktop\\people.csv";
        File file = new File(fileName);
        lists = new ArrayList<>();

        Scanner inputStream;
        try {
            inputStream = new Scanner(file);

            while (inputStream.hasNextLine()) {
                String line = inputStream.nextLine();
                String[] values = line.split(",");
                // this adds the currently parsed line to the 2-dimensional string array
                lists.add(Arrays.asList(values));
                // System.out.println(Arrays.toString(values));
                size = values.length;
            }
            inputStream.close();
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        }

        number_of_people = lists.size() - 1;
        people = new People[number_of_people];
        for (int i = 0; i < number_of_people; i++) {
            people[i] = new People();
        }
        for (int i = 0; i < number_of_people; i++) {
            people[i].setFirs_name(lists.get(i).get(0));
            people[i].setLast_name(lists.get(i).get(1));
            people[i].setId_code(lists.get(i).get(2));
            //set key for each object !
            people[i].setNode_key(lists.get(i).get(2));
            people[i].setBirth_date(lists.get(i).get(3));
            people[i].setCity(lists.get(i).get(4));
            people[i].setJob(lists.get(i).get(5));

        }
        for (int i = 0; i < number_of_people; i++) {
            people_map.put(people[i].getNode_key(), lists.get(i));
        }
    }


    List<String> peoplejob(String job1, String job2) {
        List<String> arr = new ArrayList<>();
        for (int i = 0; i < number_of_people; i++) {
            if (job1.equals(people[i].getJob()) || job2.equals(people[i].getJob())) {
                arr.add(people[i].getId_code());
            }
        }
        return arr;
    }

    public List<String> FindSmuggler() {
        List<String> arr = new ArrayList<>();
        for (int i = 0; i < number_of_people; i++) {
            if (people[i].getJob().equals("\"قاچاقچی\"")) {
                arr.add(people[i].getId_code());
            }
        }
        return arr;
    }
}
