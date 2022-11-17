package package1;

public class Cat extends Animal{
    @Override
    void animalAbstractMethod() {
        System.out.println("Animaldan kelgen abstract method");
    }

    void catMethod(){
        System.out.println("Cattin lichniy methodu");
    }

    @Override
    public void animalPublicMethod() {
        super.animalPublicMethod();
        System.out.println("Public method Cat!");
    }
}
