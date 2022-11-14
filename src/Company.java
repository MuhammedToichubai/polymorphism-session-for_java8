public class Company {
    private String companyName;
    private String address;
    private Course[] courses;

    public Company(String companyName, String address, Course[] courses) {
        this.companyName = companyName;
        this.address = address;
        this.courses = courses;
    }

    public static double income(Student[] students){
        double income = 0;
        for (Student student : students) {
            income += student.getContract();
        }
        return income;
    }


}
