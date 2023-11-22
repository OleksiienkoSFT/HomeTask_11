package Lesson_11.Pets;

public class Dog extends Pet{

    @Override
    public String getName() {
        return super.getName();
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void getWhoAmI() {
        super.getWhoAmI();
        System.out.println("I am Dog");
    }
}
