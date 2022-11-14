import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Instructor extends Person{

    private BigDecimal salary;

    public Instructor(Long id, String fullName, String age, char gender, BigDecimal salary) {
        super(id, fullName, age, gender);
        this.salary = salary;
    }

    @Override
    public LocalDateTime timeConsuming(Group group) {
        LocalDateTime timeConsuming = group.getDateOfFinish().atStartOfDay();
        return timeConsuming ;
    }
}

