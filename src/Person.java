public abstract class Person {
    private Long id;
    private String fullName;
    private String age;
    private char gender;

    public Person(Long id, String fullName, String age, char gender) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public abstract double period(Group group);

}
