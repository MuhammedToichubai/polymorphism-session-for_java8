package package2;

import java.time.LocalDate;
import java.time.Month;

public class Doctor extends Person{
    private double income;




    public Doctor() {
    }

    public Doctor(long id, String fullName, byte age, char gender, String gmail, String phoneNumber, double governmentSalary) {
        super(id, fullName, age, gender, gmail, phoneNumber, governmentSalary);
    }

    public Doctor(long id, String fullName, byte age, char gender, String gmail, String phoneNumber, double governmentSalary, double income) {
        super(id, fullName, age, gender, gmail, phoneNumber, governmentSalary);
        this.income = income;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    protected LocalDate getYearOfBirth() {
        return super.getYearOfBirth();
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
    public void favoriteSport() {
        System.out.println("The doctor loves to swim.(Дарыгер сууда сүзгөндү жакшы көрөт)");

    }

    @Override
    public String favoriteLanguage() {
        return "The doctor likes Russian(Дарыгер орус тилин жакшы көрөт)";
    }

    @Override
    public Month favoriteMonth(int month) {
        return Month.of(month);
    }

//киреше менен мамлекеттик эмгек акынын ортосундагы айырма
    public double differenceBetweenIncomeAndGovernmentWages(){
        return getIncome() - getGovernmentSalary();
    }


}
