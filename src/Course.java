public class Course {
    private String programming;
    private Group[] groups;
    private Instructor instructor;
    private Mentor[] mentor;

    public Course(String programming, Group[] groups, Instructor instructor) {
        this.programming = programming;
        this.groups = groups;
        this.instructor = instructor;
    }

    public String getProgramming() {
        return programming;
    }

    public void setProgramming(String programming) {
        this.programming = programming;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Mentor[] getMentor() {
        return mentor;
    }

    public void setMentor(Mentor[] mentor) {
        this.mentor = mentor;
    }
}
