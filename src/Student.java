
public class Student extends Person{
    private double contract;

    public Student(Long id, String fullName, String age, char gender, double contract) {
        super(id, fullName, age, gender);
        this.contract = contract;
    }

    public double getContract() {
        return contract;
    }

    public void setContract(double contract) {
        this.contract = contract;
    }
}
