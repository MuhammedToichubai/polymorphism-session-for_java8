import java.math.BigDecimal;
import java.time.Month;

public class Mentor extends Instructor{

    public Mentor(Long id, String fullName, String age, char gender, double salary) {
        super(id, fullName, age, gender, salary);
    }

    @Override
    public double period(Group group) {
        int monthValue = group.getDateOfStart().getDayOfMonth();
        int dayOfMonth = group.getDateOfFinish().getDayOfMonth();
        int month =  dayOfMonth-monthValue;
        System.out.println(month);

        return 0.9d;
    }
}
