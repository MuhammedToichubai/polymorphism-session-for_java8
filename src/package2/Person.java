package package2;

import java.time.LocalDate;
import java.time.Month;

public abstract class Person   {
    private long id;
    private String fullName;
    private byte age;
    private char gender;
    private String gmail;
    private String phoneNumber;

    private double governmentSalary;

    /**
     *                 Task for Java 8
     * 1.Person деген абстрактный класс тузунуз, анын полялары:
     * private long id;
     * private String fullName;
     * private byte age;
     * private char gender;
     * private String gmail;
     * private String phoneNumber;
     * private double governmentsSalary;
     *
     * 2.Ошол эле Person классынын ичинде getter,setter-лер болсун андан сырткары 7 методду болсун.
     * Алар төмөндөгүлөр:
     * public abstract void favoriteSport();
     * public abstract String favoriteLanguage();
     * public abstract Month favoriteMonth(int month);
     * public String getLastName(){}
     * protected LocalDate getYearOfBirth(){}
     * public String getPhoneNumberAndGmail(){}
     * public static long[] getPeopleOfAllAges(Person[] people){}
     *
     * 3.Person классын(extends) мурастаган Doctor, Driver, Programmer деген уч класс тузунуз,
     * Person классынан келген поля жана методдон сырткары
     *  ар биринде бирден озуно тийешелуу(линчнный) поля жана методду болсун (аларды озунуздор ойлоп кошунуздар).
     *
     * 4.Doctor, Driver, Programmer класстар баары Person класстагы методдорду @Override кылсын.
     * Ар бир методдун аттарына жараша логика жана маалыматтарды жазыныз.
     *
     * 4. main методдон классттарга 6 объект тузунуз.
     * Мисалы:
     * Person doctor1 = new Doctor();
     * Doctor doctor2 = new Doctor():
     *
     * Person driver1= new Driver();
     * Driver driver2= new Driver();
     *
     * Person programmer1 = new Programmer();
     * Programmer programme2 = new Programmer();
     * Объекттерге маанилерин берип ар бир объекттин меттоддорун чакырып, аларды консольго чыгарыныз!
     * Методдо жазылган логикалар туура иштеши керек!!!
     */

    //methods
//1
    public abstract void favoriteSport();
//2
    public abstract String favoriteLanguage();
//3
    public abstract Month favoriteMonth(int month);
//4
    public String getLastName(){











        return null;
    }
//5
    protected LocalDate getYearOfBirth(){
        return LocalDate.now().minusYears(getAge());
    }
//6
    public String getPhoneNumberAndGmail(){
        return "gmail: "+ getGmail()+ "\nphoneNumber: "+ getPhoneNumber();
    }
//7

    public static long[] getPeopleOfAllAges(Person[] people){
        long[] ages = new long[people.length];

        int index = 0;
        for (Person person : people) {
            ages[index] = person.getAge();
            index++;
        }

       return ages;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getGovernmentSalary() {
        return governmentSalary;
    }

    public void setGovernmentSalary(double governmentSalary) {
        this.governmentSalary = governmentSalary;
    }

    public Person() {
    }

    public Person(long id, String fullName, byte age, char gender, String gmail, String phoneNumber, double governmentSalary) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.gmail = gmail;
        this.phoneNumber = phoneNumber;
        this.governmentSalary = governmentSalary;
    }
}
