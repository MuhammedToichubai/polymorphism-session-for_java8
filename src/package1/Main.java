package package1;

public class Main {
    public static void main(String[] args) {
        Animal cat1 = new Cat();
        cat1.animalPublicMethod();
        cat1.animalAbstractMethod();


        System.out.println("_______________________");

        Cat cat2 = new Cat();
        cat2.catMethod();


    }
}
