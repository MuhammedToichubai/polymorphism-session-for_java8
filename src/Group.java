import java.time.LocalDate;

public class Group {
    private String groupName;
    private Student[] students;
    private LocalDate dateOfStart;
    private LocalDate dateOfFinish;

    public Group() {
    }

    public Group(String groupName, Student[] students, LocalDate dateOfStart, LocalDate dateOfFinish) {
        this.groupName = groupName;
        this.students = students;
        this.dateOfStart = dateOfStart;
        this.dateOfFinish = dateOfFinish;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(LocalDate dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public LocalDate getDateOfFinish() {
        return dateOfFinish;
    }

    public void setDateOfFinish(LocalDate dateOfFinish) {
        this.dateOfFinish = dateOfFinish;
    }
}
