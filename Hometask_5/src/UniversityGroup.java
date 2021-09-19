import java.util.*;

public class UniversityGroup {

    private String groupName;
    private int startYear;
    private int endYear;
    private ArrayList<String> studentList = new ArrayList<String>();

    public UniversityGroup(String groupName, int startYear) { //конструктор 1 - компилится
        this.groupName = groupName;
        this.startYear = startYear;
        this.endYear = startYear + 5;
    }
        //конструктор 2
    public UniversityGroup(String groupName, int startYear, ArrayList<String> studentList) {
        this.groupName = groupName;
        this.startYear = startYear;
        this.endYear = startYear + 5;
        this.studentList = studentList;
    }

            //методы
    public String getGroupName() {
        return groupName;
    }
    public int getStartYear() {
        return startYear;
    }
    public int getEndYear() {
        return endYear;
    }
    public ArrayList <String> getStudentList() {
        return studentList;
    }


    public void addStudent (String student) {
        studentList.add(student);
    }

    public boolean removeStudent(String student) {
        return studentList.remove(student);
    }
}