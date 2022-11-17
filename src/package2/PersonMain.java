package package2;

public class PersonMain {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.setAge((byte) 25);
        doctor.setFullName("Asanov Mukhammed");
        System.out.println("doctor.favoriteLanguage() = " + doctor.favoriteLanguage());
        System.out.println("doctor.favoriteMonth(8) = " + doctor.favoriteMonth(8));
        doctor.favoriteSport();
        System.out.println("doctor.getFullName() = " + doctor.getFullName());
        System.out.println("doctor.getLastName() = " + doctor.getLastName());
        System.out.println("doctor.getPhoneNumberAndGmail() = " + doctor.getPhoneNumberAndGmail());
        System.out.println("doctor.getYearOfBirth() = " + doctor.getYearOfBirth());

    }
}
