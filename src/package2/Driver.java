package package2;

import java.time.LocalDate;
import java.time.Month;

public class Driver extends Person {
    @Override
    public void favoriteSport() {
        System.out.println(getFullName()+ "Fut boll suiot ");
    }

    @Override
    public String favoriteLanguage() {
        return getFullName()+"  English";
    }

    @Override
    public Month favoriteMonth(int month) {
        return Month.of(11);
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    protected LocalDate getYearOfBirth() {
        return LocalDate.now();
    }

    @Override
    public String getPhoneNumberAndGmail() {
        return super.getPhoneNumberAndGmail();
    }

    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    public void setId(long id) {
        super.setId(id);
    }

    @Override
    public String getFullName() {
        return super.getFullName();
    }

    @Override
    public void setFullName(String fullName) {
        super.setFullName(fullName);
    }

    @Override
    public byte getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(byte age) {
        super.setAge(age);
    }

    @Override
    public char getGender() {
        return super.getGender();
    }

    @Override
    public void setGender(char gender) {
        super.setGender(gender);
    }

    @Override
    public String getGmail() {
        return super.getGmail();
    }

    @Override
    public void setGmail(String gmail) {
        super.setGmail(gmail);
    }

    @Override
    public String getPhoneNumber() {
        return super.getPhoneNumber();
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        super.setPhoneNumber(phoneNumber);
    }

    @Override
    public double getGovernmentSalary() {
        return super.getGovernmentSalary();
    }

    @Override
    public void setGovernmentSalary(double governmentSalary) {
        super.setGovernmentSalary(governmentSalary);
    }

    public Driver() {
        super();
    }

    public Driver(long id, String fullName, byte age, char gender, String gmail, String phoneNumber, double governmentSalary) {
        super(id, fullName, age, gender, gmail, phoneNumber, governmentSalary);
    }
}
