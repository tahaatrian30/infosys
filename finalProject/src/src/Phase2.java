package src;

import com.sun.crypto.provider.HmacMD5KeyGenerator;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Phase2 {

    private static List<String> list_of_maznoonin = new ArrayList<>();
    private static List<String> list_of_maznoonin1 = new ArrayList<>();

    static public List<String> getmaznoonin() {
        return list_of_maznoonin;
    }

    public static void main(String[] args) throws IOException, ParseException {
        make();
    }


    public static void make() {
        String job1 = "\"بندر\"";
        String job2 = "\"گمرک\"";
//        System.out.println(people.findPeople(job1,job2));

        PeopleFileReader peopleFileReader = new PeopleFileReader();
        peopleFileReader.makeFile();

        List<String> list_of_job_people = peopleFileReader.peoplejob(job1, job2);
        int peopleOfTheJob = peopleFileReader.peoplejob(job1, job2).size();

        RelationShipFileReader relationShipFileReader = new RelationShipFileReader();
        relationShipFileReader.makeFile();
        //اینجا مرج شده 2 کد ملی رو میده باید دوباره جداش کنیم؟
//      System.out.println(relationShipFileReader.getFirstRelations("\"51352605215\""));
        OwnerShipFileReader ownerShipFileReader = new OwnerShipFileReader();
        ownerShipFileReader.makeFile();
        List<String> famile_bad =new ArrayList<String>();
        for (int i = 0; i < peopleOfTheJob; i++) {
            if (ownerShipFileReader.getOwnershipList(list_of_job_people.get(i)) == 1) {
                list_of_maznoonin.add(list_of_job_people.get(i));
            } else {
                List<String> relha = new ArrayList<String>();
                relha.addAll(relationShipFileReader.getFirstRelations(list_of_job_people.get(i)));
                for (String a:relha) {
                    if (ownerShipFileReader.getOwnershipList(a)==1){
                        list_of_maznoonin1.add(list_of_job_people.get(i));
                        famile_bad.add(a);
                        continue;
                    }
                }
            }
        }
        Collections.sort(list_of_maznoonin);
        for (int i = 0; i < list_of_maznoonin.size() - 1; i++) {
            if (list_of_maznoonin.get(i) == null) {
                list_of_maznoonin.remove(i);
                continue;
            }
            while (list_of_maznoonin.get(i).equals(list_of_maznoonin.get(i + 1)) && i + 1 <= list_of_maznoonin.size()) {
                list_of_maznoonin.remove(i + 1);
            }
        }

//        System.out.println(list_of_job_people);
//        List<String> list_of_maznoonin=new ArrayList<>();
//        for (String Id : list_of_job_people) {
//            List<String> tmp = ownerShipFileReader.getOwnershipList(Id);
//            if (tmp != null) {
//                list_of_maznoonin.addAll(tmp);
//            }
//        }

//        System.out.println(list_of_job_people);
        // پرینت مظنونین
        System.out.println(list_of_maznoonin);

        for (int i = 0; i < list_of_maznoonin.size(); i++) {
            System.out.println(peopleFileReader.people_map.get(list_of_maznoonin.get(i)));
            List<String> tmp = ownerShipFileReader.getdaraee(list_of_maznoonin.get(i));
            for (String a : tmp) {
                System.out.println(ownerShipFileReader.ownership_map.get(a));
            }
        }
        for (int i = 0; i < list_of_maznoonin1.size(); i++) {
            System.out.println(peopleFileReader.people_map.get(list_of_maznoonin1.get(i)));
            System.out.println(peopleFileReader.people_map.get(famile_bad.get(i)));
            List<String> tmp = ownerShipFileReader.getdaraee(famile_bad.get(i));
            for (String a : tmp) {
                System.out.println(ownerShipFileReader.ownership_map.get(a));
            }
        }

//        List<String> list_of_first_relation_people = new ArrayList<>();
//        for (int i = 0; i < peopleOfTheJob; i++) {
//            System.out.println(relationShipFileReader.getFirstRelations(list_of_job_people.get(i)));
//            list_of_first_relation_people.add(relationShipFileReader.getFirstRelations(list_of_job_people.get(i)).get(i));
//        }
//
//        list_of_ownership_people  = new ArrayList<>();
//        for (int i = 0; i < peopleOfTheJob; i++) {
//            System.out.println(list_of_job_people.get(i) + ": " + ownerShipFileReader.getOwnershipList(list_of_job_people.get(i)));
//            if (ownerShipFileReader.getOwnershipList(list_of_job_people.get(i)).size() != 0) {
//                list_of_ownership_people.add(list_of_job_people.get(i));
//            }
//            System.out.println(list_of_first_relation_people.get(i) + ": " + ownerShipFileReader.getOwnershipList(list_of_first_relation_people.get(i)));
//            if (ownerShipFileReader.getOwnershipList(list_of_first_relation_people.get(i)).size() != 0) {
//                list_of_ownership_people.add(list_of_first_relation_people.get(i));
//            }
//            System.out.println();
//        }
//
//        int size_of_ownership_people = list_of_ownership_people.size();
//        System.out.println(list_of_ownership_people);
//
//        for (String list_of_ownership_person : list_of_ownership_people) {
//            System.out.println(peopleFileReader.people_map.get(list_of_ownership_person));
//        }
//
//        for (int i=0;i<list_of_ownership_people.size();i++) {
//            System.out.println(ownerShipFileReader.getOwnershipList(list_of_ownership_people.get(i)));
//        }
//        System.out.println("________________________");
//        //inja galat mizane!
//        for (String list_of_ownership_person : list_of_ownership_people) {
//            System.out.println(ownerShipFileReader.ownership_map.get(list_of_ownership_person));
//        }
//
//     /*   List<String> id=new ArrayList<>();
//        for (int i =1 ; i < ownerShipFileReader.ownership.length; i++) {
//
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//            Date date = sdf.parse(ownerShipFileReader.ownership[i].getDate());
//            Date current = sdf.parse("2000-01-01");
//            if(date.before(current)){
//                id.add(ownerShipFileReader.ownership[i].getFrom());
//            }
//        }*/
    }
}
