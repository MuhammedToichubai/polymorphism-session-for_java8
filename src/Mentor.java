import java.math.BigDecimal;

public class Mentor extends Instructor{

    public Mentor(Long id, String fullName, String age, char gender, BigDecimal salary) {
        super(id, fullName, age, gender, salary);
    }
}
