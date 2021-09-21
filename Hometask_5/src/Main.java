import java.util.*;

public class Main {
    public static void main(String[] args) {
        UniversityGroup uni1 = new UniversityGroup("Engineers", 2001);

        uni1.addStudent("Vasya");
        uni1.addStudent("Kolya");
        uni1.addStudent("Misha");
        uni1.addStudent("Pasha");
        uni1.addStudent("Oleg");
        boolean remove = uni1.removeStudent("Kolya");

        ArrayList<String> List = new ArrayList<String>();
        List.add("Vasya2");
        List.add("Kolya2");
        List.add("Misha2");
        List.add("Pasha2");
        List.add("Oleg2");
        UniversityGroup uni2 = new UniversityGroup("Gumanitarii", 2013, List);
        boolean remove2 = uni2.removeStudent("Pasha2");

        System.out.println("Group : " + uni1.getGroupName());
        System.out.println("Start : " + uni1.getStartYear());
        System.out.println("End : " + uni1.getEndYear());
        System.out.println("List : " + uni1.getStudentList());

        System.out.println("Group : " + uni2.getGroupName());
        System.out.println("Start : " + uni2.getStartYear());
        System.out.println("End : " + uni2.getEndYear());
        System.out.println("List : " + uni2.getStudentList());

    }
}