import java.util.*;

public class Main {
    public static void main(String[] args) {
        UniversityGroup uni1 = new UniversityGroup("Engineers", 2001);
        UniversityGroup uni2 = new UniversityGroup("Gumanitarii", 2013);

        // идея предложила упростить
        /*for (String s1 : Arrays.asList("Vasichkin", "Pivnev", "Sokolovv", "Kopiychuk", "Volkov")) {
                uni1.addStudent(s1);
            }
        UniversityGroup uni2 = new UniversityGroup("Gumanitarii", 2013);
            for (String s2 : Arrays.asList("Ivanov", "Petrov", "Sidorov", "Kozakov", "Bulochkin")) {
                uni1.addStudent(s2);*/

        uni1.addStudent("Vasya");
        uni1.addStudent("Kolya");
        uni1.addStudent("Misha");
        uni1.addStudent("Pasha");
        uni1.addStudent("Oleg");
        boolean remove = uni1.removeStudent("Kolya");

        uni2.addStudent("Vasya2");
        uni2.addStudent("Kolya2");
        uni2.addStudent("Misha2");
        uni2.addStudent("Pasha2");
        uni2.addStudent("Oleg2");
        boolean remove2 = uni2.removeStudent("Pasha2");

        //System.out.println(remove);
        //System.out.println(remove2);

        // System.out.println(uni1.getGroupDescription());

        System.out.println("Group : " + uni1.getGroupName());
        System.out.println("Start : " + uni1.getStartYear());
        System.out.println("End : " + uni1.getEndYear());
        System.out.println("List : " + uni1.getStudentList());
        //как добавить Ентер при выводе в консоль???
        System.out.println("Group : " + uni2.getGroupName());
        System.out.println("Start : " + uni2.getStartYear());
        System.out.println("End : " + uni2.getEndYear());
        System.out.println("List : " + uni2.getStudentList());

    }
}