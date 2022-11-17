import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {














        Instructor instructor = new Instructor(1L, "Aijamal Asangazieva", "27", 'F', 2000d);
        Mentor mentor = new Mentor(1L, "Maksat Akyl", "?", 'M', 1800);
        Mentor mentor1 = new Mentor(1L, "Mukhammed Asantegin", "25", 'M', 1800);
        Mentor mentor2 = new Mentor(1L, "Rahim Bazarbaev", "25", 'M', 1800);
        Student student = new Student(1L, "Baiysh Orozaliev", "20", 'F', 12000d);
        Group group = new Group("Java",
                new Student[]{student},
                LocalDate.of(2022, 9, 3),
                LocalDate.of(2023, 7, 3));

        Course course = new Course("Java",
                new Group[]{ group },
                instructor
        );
        course.setMentor(new Mentor[]{mentor, mentor1, mentor2});

        double periodMentor = mentor.period(group);

        System.out.println("mentor.getSalary() = " + mentor.getSalary());

        System.out.println("periodMentor = " + periodMentor);


    }

}