package Lesson_11.Pets;

public class Cat extends Pet {

    @Override
    public String getName() {
        return super.getName();
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void getWhoAmI() {
        super.getWhoAmI();
        System.out.println("I am cat");
    }
}
